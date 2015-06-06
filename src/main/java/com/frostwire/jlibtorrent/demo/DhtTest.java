package com.frostwire.jlibtorrent.demo;

import com.frostwire.jlibtorrent.AlertListener;
import com.frostwire.jlibtorrent.DHT;
import com.frostwire.jlibtorrent.Session;
import com.frostwire.jlibtorrent.TcpEndpoint;
import com.frostwire.jlibtorrent.alerts.Alert;
import com.frostwire.jlibtorrent.alerts.DhtBootstrapAlert;
import com.frostwire.jlibtorrent.alerts.DhtGetPeersReplyAlert;
import com.frostwire.jlibtorrent.alerts.ExternalIpAlert;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @author gubatron
 * @author aldenml
 */
public final class DhtTest {

    public static void main(String[] args) throws Throwable {

        final Session s = new Session();
        final DHT dht = new DHT(s);

        final CountDownLatch signal = new CountDownLatch(1);

        final String[] externalEndp = new String[1];

        s.addListener(new AlertListener() {

            @Override
            public int[] types() {
                return null;
            }

            @Override
            public void alert(Alert<?> alert) {
                System.out.println(alert);

                if (alert instanceof DhtBootstrapAlert) {
                    signal.countDown();
                }

                if (alert instanceof DhtGetPeersReplyAlert) {
                    ArrayList<TcpEndpoint> peers = ((DhtGetPeersReplyAlert) alert).getPeers();
                    for (int i = 0; i < peers.size(); i++) {
                        System.out.println(peers.get(i));
                    }
                    System.out.println("EXTERNAL: " + externalEndp[0]);
                }

                if (alert instanceof ExternalIpAlert) {
                    String addr = ((ExternalIpAlert) alert).getExternalAddress().toString();
                    int port = s.getListenPort();
                    externalEndp[0] = addr + ":" + port;
                }
            }
        });

        System.out.println("Waiting to DHT bootstrap");

        signal.await(10, TimeUnit.SECONDS);

        System.out.println("Calling dht_get_peers");

        dht.getPeers("86d0502ead28e495c9e67665340f72aa72fe304");

        System.out.println("Waiting DHT have nodes");
        dht.waitNodes(1);

        Thread.sleep(5000);

        dht.announce("47d0502ead28e495c9e67665340f72aa72fe304", 9999, 0);

        System.out.println("Waiting 15 seconds");
        Thread.sleep(15000);

        //dht.getPeers("5472d2fe734c16f28912e1e756b57e2470148b93");
        dht.getPeers("47d0502ead28e495c9e67665340f72aa72fe304");

        System.out.println("Nodes in DHT: " + dht.totalNodes());

        System.out.println("Press ENTER to exit");
        System.in.read();
    }
}
