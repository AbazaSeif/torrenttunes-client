package com.frostwire.jlibtorrent.demo;

import com.frostwire.jlibtorrent.*;
import com.frostwire.jlibtorrent.alerts.Alert;

import java.util.LinkedList;
import java.util.List;

/**
 * @author gubatron
 * @author aldenml
 */
public final class DhtRouter {

    public static void main(String[] args) throws Throwable {

        Session s = new Session(new Fingerprint(), new Pair<Integer, Integer>(0, 0), "0.0.0.0", defaultRouters());
        s.addListener(new AlertListener() {
            @Override
            public int[] types() {
                return null;
            }

            @Override
            public void alert(Alert<?> alert) {
                System.out.println(alert.getType() + " - " + alert.getSwig().what() + " - " + alert.getSwig().message());
            }
        });

        Thread.sleep(5000);
        s.dhtGetPeers(new Sha1Hash("86d0502ead28e495c9e67665340f72aa72fe304e"));

        DHT dht = new DHT(s);

        System.out.println("Waiting for nodes in DHT");
        Thread.sleep(5000);
        System.out.println("Nodes in DHT: " + dht.totalNodes());
    }

    private static List<Pair<String, Integer>> defaultRouters() {
        List<Pair<String, Integer>> list = new LinkedList<Pair<String, Integer>>();

        list.add(new Pair<String, Integer>("router.bittorrent.com", 6881));
        list.add(new Pair<String, Integer>("dht.transmissionbt.com", 6881));

        return list;
    }
}
