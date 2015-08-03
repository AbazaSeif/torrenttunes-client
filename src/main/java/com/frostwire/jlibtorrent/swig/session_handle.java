/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class session_handle {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected session_handle(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(session_handle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_session_handle(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void save_state(entry e, long flags) {
    libtorrent_jni.session_handle_save_state__SWIG_0(swigCPtr, this, entry.getCPtr(e), e, flags);
  }

  public void save_state(entry e) {
    libtorrent_jni.session_handle_save_state__SWIG_1(swigCPtr, this, entry.getCPtr(e), e);
  }

  public void load_state(bdecode_node e) {
    libtorrent_jni.session_handle_load_state(swigCPtr, this, bdecode_node.getCPtr(e), e);
  }

  public void refresh_torrent_status(torrent_status_vector ret, long flags) {
    libtorrent_jni.session_handle_refresh_torrent_status__SWIG_0(swigCPtr, this, torrent_status_vector.getCPtr(ret), ret, flags);
  }

  public void refresh_torrent_status(torrent_status_vector ret) {
    libtorrent_jni.session_handle_refresh_torrent_status__SWIG_1(swigCPtr, this, torrent_status_vector.getCPtr(ret), ret);
  }

  public void post_torrent_updates(long flags) {
    libtorrent_jni.session_handle_post_torrent_updates__SWIG_0(swigCPtr, this, flags);
  }

  public void post_torrent_updates() {
    libtorrent_jni.session_handle_post_torrent_updates__SWIG_1(swigCPtr, this);
  }

  public void post_session_stats() {
    libtorrent_jni.session_handle_post_session_stats(swigCPtr, this);
  }

  public void post_dht_stats() {
    libtorrent_jni.session_handle_post_dht_stats(swigCPtr, this);
  }

  public torrent_handle find_torrent(sha1_hash info_hash) {
    return new torrent_handle(libtorrent_jni.session_handle_find_torrent(swigCPtr, this, sha1_hash.getCPtr(info_hash), info_hash), true);
  }

  public torrent_handle_vector get_torrents() {
    return new torrent_handle_vector(libtorrent_jni.session_handle_get_torrents(swigCPtr, this), true);
  }

  public torrent_handle add_torrent(add_torrent_params params) {
    return new torrent_handle(libtorrent_jni.session_handle_add_torrent__SWIG_0(swigCPtr, this, add_torrent_params.getCPtr(params), params), true);
  }

  public torrent_handle add_torrent(add_torrent_params params, error_code ec) {
    return new torrent_handle(libtorrent_jni.session_handle_add_torrent__SWIG_1(swigCPtr, this, add_torrent_params.getCPtr(params), params, error_code.getCPtr(ec), ec), true);
  }

  public void async_add_torrent(add_torrent_params params) {
    libtorrent_jni.session_handle_async_add_torrent(swigCPtr, this, add_torrent_params.getCPtr(params), params);
  }

  public void pause() {
    libtorrent_jni.session_handle_pause(swigCPtr, this);
  }

  public void resume() {
    libtorrent_jni.session_handle_resume(swigCPtr, this);
  }

  public boolean is_paused() {
    return libtorrent_jni.session_handle_is_paused(swigCPtr, this);
  }

  public void get_cache_info(cache_status ret, torrent_handle h, int flags) {
    libtorrent_jni.session_handle_get_cache_info__SWIG_0(swigCPtr, this, cache_status.getCPtr(ret), ret, torrent_handle.getCPtr(h), h, flags);
  }

  public void get_cache_info(cache_status ret, torrent_handle h) {
    libtorrent_jni.session_handle_get_cache_info__SWIG_1(swigCPtr, this, cache_status.getCPtr(ret), ret, torrent_handle.getCPtr(h), h);
  }

  public void get_cache_info(cache_status ret) {
    libtorrent_jni.session_handle_get_cache_info__SWIG_2(swigCPtr, this, cache_status.getCPtr(ret), ret);
  }

  public void set_dht_settings(dht_settings settings) {
    libtorrent_jni.session_handle_set_dht_settings(swigCPtr, this, dht_settings.getCPtr(settings), settings);
  }

  public boolean is_dht_running() {
    return libtorrent_jni.session_handle_is_dht_running(swigCPtr, this);
  }

  public dht_settings get_dht_settings() {
    return new dht_settings(libtorrent_jni.session_handle_get_dht_settings(swigCPtr, this), true);
  }

  public void add_dht_node(string_int_pair node) {
    libtorrent_jni.session_handle_add_dht_node(swigCPtr, this, string_int_pair.getCPtr(node), node);
  }

  public void add_dht_router(string_int_pair node) {
    libtorrent_jni.session_handle_add_dht_router(swigCPtr, this, string_int_pair.getCPtr(node), node);
  }

  public void dht_get_item(sha1_hash target) {
    libtorrent_jni.session_handle_dht_get_item__SWIG_0(swigCPtr, this, sha1_hash.getCPtr(target), target);
  }

  public sha1_hash dht_put_item(entry data) {
    return new sha1_hash(libtorrent_jni.session_handle_dht_put_item__SWIG_0(swigCPtr, this, entry.getCPtr(data), data), true);
  }

  public void dht_get_peers(sha1_hash info_hash) {
    libtorrent_jni.session_handle_dht_get_peers(swigCPtr, this, sha1_hash.getCPtr(info_hash), info_hash);
  }

  public void dht_announce(sha1_hash info_hash, int port, int flags) {
    libtorrent_jni.session_handle_dht_announce__SWIG_0(swigCPtr, this, sha1_hash.getCPtr(info_hash), info_hash, port, flags);
  }

  public void dht_announce(sha1_hash info_hash, int port) {
    libtorrent_jni.session_handle_dht_announce__SWIG_1(swigCPtr, this, sha1_hash.getCPtr(info_hash), info_hash, port);
  }

  public void dht_announce(sha1_hash info_hash) {
    libtorrent_jni.session_handle_dht_announce__SWIG_2(swigCPtr, this, sha1_hash.getCPtr(info_hash), info_hash);
  }

  public void set_ip_filter(ip_filter f) {
    libtorrent_jni.session_handle_set_ip_filter(swigCPtr, this, ip_filter.getCPtr(f), f);
  }

  public ip_filter get_ip_filter() {
    return new ip_filter(libtorrent_jni.session_handle_get_ip_filter(swigCPtr, this), true);
  }

  public void set_port_filter(port_filter f) {
    libtorrent_jni.session_handle_set_port_filter(swigCPtr, this, port_filter.getCPtr(f), f);
  }

  public sha1_hash id() {
    return new sha1_hash(libtorrent_jni.session_handle_id(swigCPtr, this), true);
  }

  public void set_key(int key) {
    libtorrent_jni.session_handle_set_key(swigCPtr, this, key);
  }

  public int listen_port() {
    return libtorrent_jni.session_handle_listen_port(swigCPtr, this);
  }

  public int ssl_listen_port() {
    return libtorrent_jni.session_handle_ssl_listen_port(swigCPtr, this);
  }

  public boolean is_listening() {
    return libtorrent_jni.session_handle_is_listening(swigCPtr, this);
  }

  public void set_peer_class_filter(ip_filter f) {
    libtorrent_jni.session_handle_set_peer_class_filter(swigCPtr, this, ip_filter.getCPtr(f), f);
  }

  public void set_peer_class_type_filter(peer_class_type_filter f) {
    libtorrent_jni.session_handle_set_peer_class_type_filter(swigCPtr, this, peer_class_type_filter.getCPtr(f), f);
  }

  public int create_peer_class(String name) {
    return libtorrent_jni.session_handle_create_peer_class(swigCPtr, this, name);
  }

  public void delete_peer_class(int cid) {
    libtorrent_jni.session_handle_delete_peer_class(swigCPtr, this, cid);
  }

  public peer_class_info get_peer_class(int cid) {
    return new peer_class_info(libtorrent_jni.session_handle_get_peer_class(swigCPtr, this, cid), true);
  }

  public void set_peer_class(int cid, peer_class_info pci) {
    libtorrent_jni.session_handle_set_peer_class(swigCPtr, this, cid, peer_class_info.getCPtr(pci), pci);
  }

  public void remove_torrent(torrent_handle h, int options) {
    libtorrent_jni.session_handle_remove_torrent__SWIG_0(swigCPtr, this, torrent_handle.getCPtr(h), h, options);
  }

  public void remove_torrent(torrent_handle h) {
    libtorrent_jni.session_handle_remove_torrent__SWIG_1(swigCPtr, this, torrent_handle.getCPtr(h), h);
  }

  public void apply_settings(settings_pack s) {
    libtorrent_jni.session_handle_apply_settings(swigCPtr, this, settings_pack.getCPtr(s), s);
  }

  public settings_pack get_settings() {
    return new settings_pack(libtorrent_jni.session_handle_get_settings(swigCPtr, this), true);
  }

  public void pop_alerts(alert_ptr_vector alerts) {
    libtorrent_jni.session_handle_pop_alerts(swigCPtr, this, alert_ptr_vector.getCPtr(alerts), alerts);
  }

  public alert wait_for_alert(high_resolution_clock.duration max_wait) {
    long cPtr = libtorrent_jni.session_handle_wait_for_alert(swigCPtr, this, high_resolution_clock.duration.getCPtr(max_wait), max_wait);
    return (cPtr == 0) ? null : new alert(cPtr, false);
  }

  public int add_port_mapping(session_handle.protocol_type t, int external_port, int local_port) {
    return libtorrent_jni.session_handle_add_port_mapping(swigCPtr, this, t.swigValue(), external_port, local_port);
  }

  public void delete_port_mapping(int handle) {
    libtorrent_jni.session_handle_delete_port_mapping(swigCPtr, this, handle);
  }

  public void add_lt_trackers_extension() {
    libtorrent_jni.session_handle_add_lt_trackers_extension(swigCPtr, this);
  }

  public void add_smart_ban_extension() {
    libtorrent_jni.session_handle_add_smart_ban_extension(swigCPtr, this);
  }

  public void dht_get_item(char_vector key_v, String salt) {
    libtorrent_jni.session_handle_dht_get_item__SWIG_1(swigCPtr, this, char_vector.getCPtr(key_v), key_v, salt);
  }

  public void dht_get_item(char_vector key_v) {
    libtorrent_jni.session_handle_dht_get_item__SWIG_2(swigCPtr, this, char_vector.getCPtr(key_v), key_v);
  }

  public void dht_put_item(char_vector public_key, char_vector private_key, entry data, String salt) {
    libtorrent_jni.session_handle_dht_put_item__SWIG_1(swigCPtr, this, char_vector.getCPtr(public_key), public_key, char_vector.getCPtr(private_key), private_key, entry.getCPtr(data), data, salt);
  }

  public void dht_put_item(char_vector public_key, char_vector private_key, entry data) {
    libtorrent_jni.session_handle_dht_put_item__SWIG_2(swigCPtr, this, char_vector.getCPtr(public_key), public_key, char_vector.getCPtr(private_key), private_key, entry.getCPtr(data), data);
  }

  public upnp get_upnp() {
    long cPtr = libtorrent_jni.session_handle_get_upnp(swigCPtr, this);
    return (cPtr == 0) ? null : new upnp(cPtr, false);
  }

  public void add_swig_extension(swig_plugin p) {
    libtorrent_jni.session_handle_add_swig_extension(swigCPtr, this, swig_plugin.getCPtr(p), p);
  }

  public enum save_state_flags_t {
    save_settings(libtorrent_jni.session_handle_save_settings_get()),
    save_dht_settings(libtorrent_jni.session_handle_save_dht_settings_get()),
    save_dht_state(libtorrent_jni.session_handle_save_dht_state_get()),
    save_encryption_settings(libtorrent_jni.session_handle_save_encryption_settings_get()),
    save_as_map(libtorrent_jni.session_handle_save_as_map_get());

    public final int swigValue() {
      return swigValue;
    }

    public static save_state_flags_t swigToEnum(int swigValue) {
      save_state_flags_t[] swigValues = save_state_flags_t.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (save_state_flags_t swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + save_state_flags_t.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private save_state_flags_t() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private save_state_flags_t(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private save_state_flags_t(save_state_flags_t swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public final static int disk_cache_no_pieces = libtorrent_jni.session_handle_disk_cache_no_pieces_get();

  public final static int global_peer_class_id = libtorrent_jni.session_handle_global_peer_class_id_get();
  public final static int tcp_peer_class_id = libtorrent_jni.session_handle_tcp_peer_class_id_get();
  public final static int local_peer_class_id = libtorrent_jni.session_handle_local_peer_class_id_get();

  public enum options_t {
    delete_files(libtorrent_jni.session_handle_delete_files_get());

    public final int swigValue() {
      return swigValue;
    }

    public static options_t swigToEnum(int swigValue) {
      options_t[] swigValues = options_t.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (options_t swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + options_t.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private options_t() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private options_t(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private options_t(options_t swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum session_flags_t {
    add_default_plugins(libtorrent_jni.session_handle_add_default_plugins_get()),
    start_default_features(libtorrent_jni.session_handle_start_default_features_get());

    public final int swigValue() {
      return swigValue;
    }

    public static session_flags_t swigToEnum(int swigValue) {
      session_flags_t[] swigValues = session_flags_t.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (session_flags_t swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + session_flags_t.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private session_flags_t() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private session_flags_t(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private session_flags_t(session_flags_t swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum protocol_type {
    udp(libtorrent_jni.session_handle_udp_get()),
    tcp(libtorrent_jni.session_handle_tcp_get());

    public final int swigValue() {
      return swigValue;
    }

    public static protocol_type swigToEnum(int swigValue) {
      protocol_type[] swigValues = protocol_type.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (protocol_type swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + protocol_type.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private protocol_type() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private protocol_type(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private protocol_type(protocol_type swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
