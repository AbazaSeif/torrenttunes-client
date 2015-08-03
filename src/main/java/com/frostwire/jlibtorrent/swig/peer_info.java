/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class peer_info {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected peer_info(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(peer_info obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_peer_info(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInet_as_name(String value) {
    libtorrent_jni.peer_info_inet_as_name_set(swigCPtr, this, value);
  }

  public String getInet_as_name() {
    return libtorrent_jni.peer_info_inet_as_name_get(swigCPtr, this);
  }

  public void setClient(String value) {
    libtorrent_jni.peer_info_client_set(swigCPtr, this, value);
  }

  public String getClient() {
    return libtorrent_jni.peer_info_client_get(swigCPtr, this);
  }

  public void setPieces(bitfield value) {
    libtorrent_jni.peer_info_pieces_set(swigCPtr, this, bitfield.getCPtr(value), value);
  }

  public bitfield getPieces() {
    long cPtr = libtorrent_jni.peer_info_pieces_get(swigCPtr, this);
    return (cPtr == 0) ? null : new bitfield(cPtr, false);
  }

  public void setTotal_download(long value) {
    libtorrent_jni.peer_info_total_download_set(swigCPtr, this, value);
  }

  public long getTotal_download() {
    return libtorrent_jni.peer_info_total_download_get(swigCPtr, this);
  }

  public void setTotal_upload(long value) {
    libtorrent_jni.peer_info_total_upload_set(swigCPtr, this, value);
  }

  public long getTotal_upload() {
    return libtorrent_jni.peer_info_total_upload_get(swigCPtr, this);
  }

  public void setLast_request(high_resolution_clock.duration value) {
    libtorrent_jni.peer_info_last_request_set(swigCPtr, this, high_resolution_clock.duration.getCPtr(value), value);
  }

  public high_resolution_clock.duration getLast_request() {
    long cPtr = libtorrent_jni.peer_info_last_request_get(swigCPtr, this);
    return (cPtr == 0) ? null : new high_resolution_clock.duration(cPtr, false);
  }

  public void setLast_active(high_resolution_clock.duration value) {
    libtorrent_jni.peer_info_last_active_set(swigCPtr, this, high_resolution_clock.duration.getCPtr(value), value);
  }

  public high_resolution_clock.duration getLast_active() {
    long cPtr = libtorrent_jni.peer_info_last_active_get(swigCPtr, this);
    return (cPtr == 0) ? null : new high_resolution_clock.duration(cPtr, false);
  }

  public void setDownload_queue_time(high_resolution_clock.duration value) {
    libtorrent_jni.peer_info_download_queue_time_set(swigCPtr, this, high_resolution_clock.duration.getCPtr(value), value);
  }

  public high_resolution_clock.duration getDownload_queue_time() {
    long cPtr = libtorrent_jni.peer_info_download_queue_time_get(swigCPtr, this);
    return (cPtr == 0) ? null : new high_resolution_clock.duration(cPtr, false);
  }

  public void setFlags(long value) {
    libtorrent_jni.peer_info_flags_set(swigCPtr, this, value);
  }

  public long getFlags() {
    return libtorrent_jni.peer_info_flags_get(swigCPtr, this);
  }

  public void setSource(long value) {
    libtorrent_jni.peer_info_source_set(swigCPtr, this, value);
  }

  public long getSource() {
    return libtorrent_jni.peer_info_source_get(swigCPtr, this);
  }

  public void setUp_speed(int value) {
    libtorrent_jni.peer_info_up_speed_set(swigCPtr, this, value);
  }

  public int getUp_speed() {
    return libtorrent_jni.peer_info_up_speed_get(swigCPtr, this);
  }

  public void setDown_speed(int value) {
    libtorrent_jni.peer_info_down_speed_set(swigCPtr, this, value);
  }

  public int getDown_speed() {
    return libtorrent_jni.peer_info_down_speed_get(swigCPtr, this);
  }

  public void setPayload_up_speed(int value) {
    libtorrent_jni.peer_info_payload_up_speed_set(swigCPtr, this, value);
  }

  public int getPayload_up_speed() {
    return libtorrent_jni.peer_info_payload_up_speed_get(swigCPtr, this);
  }

  public void setPayload_down_speed(int value) {
    libtorrent_jni.peer_info_payload_down_speed_set(swigCPtr, this, value);
  }

  public int getPayload_down_speed() {
    return libtorrent_jni.peer_info_payload_down_speed_get(swigCPtr, this);
  }

  public void setPid(sha1_hash value) {
    libtorrent_jni.peer_info_pid_set(swigCPtr, this, sha1_hash.getCPtr(value), value);
  }

  public sha1_hash getPid() {
    long cPtr = libtorrent_jni.peer_info_pid_get(swigCPtr, this);
    return (cPtr == 0) ? null : new sha1_hash(cPtr, false);
  }

  public void setQueue_bytes(int value) {
    libtorrent_jni.peer_info_queue_bytes_set(swigCPtr, this, value);
  }

  public int getQueue_bytes() {
    return libtorrent_jni.peer_info_queue_bytes_get(swigCPtr, this);
  }

  public void setRequest_timeout(int value) {
    libtorrent_jni.peer_info_request_timeout_set(swigCPtr, this, value);
  }

  public int getRequest_timeout() {
    return libtorrent_jni.peer_info_request_timeout_get(swigCPtr, this);
  }

  public void setSend_buffer_size(int value) {
    libtorrent_jni.peer_info_send_buffer_size_set(swigCPtr, this, value);
  }

  public int getSend_buffer_size() {
    return libtorrent_jni.peer_info_send_buffer_size_get(swigCPtr, this);
  }

  public void setUsed_send_buffer(int value) {
    libtorrent_jni.peer_info_used_send_buffer_set(swigCPtr, this, value);
  }

  public int getUsed_send_buffer() {
    return libtorrent_jni.peer_info_used_send_buffer_get(swigCPtr, this);
  }

  public void setReceive_buffer_size(int value) {
    libtorrent_jni.peer_info_receive_buffer_size_set(swigCPtr, this, value);
  }

  public int getReceive_buffer_size() {
    return libtorrent_jni.peer_info_receive_buffer_size_get(swigCPtr, this);
  }

  public void setUsed_receive_buffer(int value) {
    libtorrent_jni.peer_info_used_receive_buffer_set(swigCPtr, this, value);
  }

  public int getUsed_receive_buffer() {
    return libtorrent_jni.peer_info_used_receive_buffer_get(swigCPtr, this);
  }

  public void setNum_hashfails(int value) {
    libtorrent_jni.peer_info_num_hashfails_set(swigCPtr, this, value);
  }

  public int getNum_hashfails() {
    return libtorrent_jni.peer_info_num_hashfails_get(swigCPtr, this);
  }

  public void setInet_as(int value) {
    libtorrent_jni.peer_info_inet_as_set(swigCPtr, this, value);
  }

  public int getInet_as() {
    return libtorrent_jni.peer_info_inet_as_get(swigCPtr, this);
  }

  public void setDownload_queue_length(int value) {
    libtorrent_jni.peer_info_download_queue_length_set(swigCPtr, this, value);
  }

  public int getDownload_queue_length() {
    return libtorrent_jni.peer_info_download_queue_length_get(swigCPtr, this);
  }

  public void setTimed_out_requests(int value) {
    libtorrent_jni.peer_info_timed_out_requests_set(swigCPtr, this, value);
  }

  public int getTimed_out_requests() {
    return libtorrent_jni.peer_info_timed_out_requests_get(swigCPtr, this);
  }

  public void setBusy_requests(int value) {
    libtorrent_jni.peer_info_busy_requests_set(swigCPtr, this, value);
  }

  public int getBusy_requests() {
    return libtorrent_jni.peer_info_busy_requests_get(swigCPtr, this);
  }

  public void setRequests_in_buffer(int value) {
    libtorrent_jni.peer_info_requests_in_buffer_set(swigCPtr, this, value);
  }

  public int getRequests_in_buffer() {
    return libtorrent_jni.peer_info_requests_in_buffer_get(swigCPtr, this);
  }

  public void setTarget_dl_queue_length(int value) {
    libtorrent_jni.peer_info_target_dl_queue_length_set(swigCPtr, this, value);
  }

  public int getTarget_dl_queue_length() {
    return libtorrent_jni.peer_info_target_dl_queue_length_get(swigCPtr, this);
  }

  public void setUpload_queue_length(int value) {
    libtorrent_jni.peer_info_upload_queue_length_set(swigCPtr, this, value);
  }

  public int getUpload_queue_length() {
    return libtorrent_jni.peer_info_upload_queue_length_get(swigCPtr, this);
  }

  public void setFailcount(int value) {
    libtorrent_jni.peer_info_failcount_set(swigCPtr, this, value);
  }

  public int getFailcount() {
    return libtorrent_jni.peer_info_failcount_get(swigCPtr, this);
  }

  public void setDownloading_piece_index(int value) {
    libtorrent_jni.peer_info_downloading_piece_index_set(swigCPtr, this, value);
  }

  public int getDownloading_piece_index() {
    return libtorrent_jni.peer_info_downloading_piece_index_get(swigCPtr, this);
  }

  public void setDownloading_block_index(int value) {
    libtorrent_jni.peer_info_downloading_block_index_set(swigCPtr, this, value);
  }

  public int getDownloading_block_index() {
    return libtorrent_jni.peer_info_downloading_block_index_get(swigCPtr, this);
  }

  public void setDownloading_progress(int value) {
    libtorrent_jni.peer_info_downloading_progress_set(swigCPtr, this, value);
  }

  public int getDownloading_progress() {
    return libtorrent_jni.peer_info_downloading_progress_get(swigCPtr, this);
  }

  public void setDownloading_total(int value) {
    libtorrent_jni.peer_info_downloading_total_set(swigCPtr, this, value);
  }

  public int getDownloading_total() {
    return libtorrent_jni.peer_info_downloading_total_get(swigCPtr, this);
  }

  public void setConnection_type(int value) {
    libtorrent_jni.peer_info_connection_type_set(swigCPtr, this, value);
  }

  public int getConnection_type() {
    return libtorrent_jni.peer_info_connection_type_get(swigCPtr, this);
  }

  public void setRemote_dl_rate(int value) {
    libtorrent_jni.peer_info_remote_dl_rate_set(swigCPtr, this, value);
  }

  public int getRemote_dl_rate() {
    return libtorrent_jni.peer_info_remote_dl_rate_get(swigCPtr, this);
  }

  public void setPending_disk_bytes(int value) {
    libtorrent_jni.peer_info_pending_disk_bytes_set(swigCPtr, this, value);
  }

  public int getPending_disk_bytes() {
    return libtorrent_jni.peer_info_pending_disk_bytes_get(swigCPtr, this);
  }

  public void setPending_disk_read_bytes(int value) {
    libtorrent_jni.peer_info_pending_disk_read_bytes_set(swigCPtr, this, value);
  }

  public int getPending_disk_read_bytes() {
    return libtorrent_jni.peer_info_pending_disk_read_bytes_get(swigCPtr, this);
  }

  public void setSend_quota(int value) {
    libtorrent_jni.peer_info_send_quota_set(swigCPtr, this, value);
  }

  public int getSend_quota() {
    return libtorrent_jni.peer_info_send_quota_get(swigCPtr, this);
  }

  public void setReceive_quota(int value) {
    libtorrent_jni.peer_info_receive_quota_set(swigCPtr, this, value);
  }

  public int getReceive_quota() {
    return libtorrent_jni.peer_info_receive_quota_get(swigCPtr, this);
  }

  public void setRtt(int value) {
    libtorrent_jni.peer_info_rtt_set(swigCPtr, this, value);
  }

  public int getRtt() {
    return libtorrent_jni.peer_info_rtt_get(swigCPtr, this);
  }

  public void setNum_pieces(int value) {
    libtorrent_jni.peer_info_num_pieces_set(swigCPtr, this, value);
  }

  public int getNum_pieces() {
    return libtorrent_jni.peer_info_num_pieces_get(swigCPtr, this);
  }

  public void setDownload_rate_peak(int value) {
    libtorrent_jni.peer_info_download_rate_peak_set(swigCPtr, this, value);
  }

  public int getDownload_rate_peak() {
    return libtorrent_jni.peer_info_download_rate_peak_get(swigCPtr, this);
  }

  public void setUpload_rate_peak(int value) {
    libtorrent_jni.peer_info_upload_rate_peak_set(swigCPtr, this, value);
  }

  public int getUpload_rate_peak() {
    return libtorrent_jni.peer_info_upload_rate_peak_get(swigCPtr, this);
  }

  public void setProgress(float value) {
    libtorrent_jni.peer_info_progress_set(swigCPtr, this, value);
  }

  public float getProgress() {
    return libtorrent_jni.peer_info_progress_get(swigCPtr, this);
  }

  public void setProgress_ppm(int value) {
    libtorrent_jni.peer_info_progress_ppm_set(swigCPtr, this, value);
  }

  public int getProgress_ppm() {
    return libtorrent_jni.peer_info_progress_ppm_get(swigCPtr, this);
  }

  public void setEstimated_reciprocation_rate(int value) {
    libtorrent_jni.peer_info_estimated_reciprocation_rate_set(swigCPtr, this, value);
  }

  public int getEstimated_reciprocation_rate() {
    return libtorrent_jni.peer_info_estimated_reciprocation_rate_get(swigCPtr, this);
  }

  public void setIp(tcp_endpoint value) {
    libtorrent_jni.peer_info_ip_set(swigCPtr, this, tcp_endpoint.getCPtr(value), value);
  }

  public tcp_endpoint getIp() {
    long cPtr = libtorrent_jni.peer_info_ip_get(swigCPtr, this);
    return (cPtr == 0) ? null : new tcp_endpoint(cPtr, false);
  }

  public void setLocal_endpoint(tcp_endpoint value) {
    libtorrent_jni.peer_info_local_endpoint_set(swigCPtr, this, tcp_endpoint.getCPtr(value), value);
  }

  public tcp_endpoint getLocal_endpoint() {
    long cPtr = libtorrent_jni.peer_info_local_endpoint_get(swigCPtr, this);
    return (cPtr == 0) ? null : new tcp_endpoint(cPtr, false);
  }

  public void setRead_state(char value) {
    libtorrent_jni.peer_info_read_state_set(swigCPtr, this, value);
  }

  public char getRead_state() {
    return libtorrent_jni.peer_info_read_state_get(swigCPtr, this);
  }

  public void setWrite_state(char value) {
    libtorrent_jni.peer_info_write_state_set(swigCPtr, this, value);
  }

  public char getWrite_state() {
    return libtorrent_jni.peer_info_write_state_get(swigCPtr, this);
  }

  public void setCountry(String value) {
    libtorrent_jni.peer_info_country_set(swigCPtr, this, value);
  }

  public String getCountry() {
    return libtorrent_jni.peer_info_country_get(swigCPtr, this);
  }

  public peer_info() {
    this(libtorrent_jni.new_peer_info(), true);
  }

  public enum peer_flags_t {
    interesting(libtorrent_jni.peer_info_interesting_get()),
    choked(libtorrent_jni.peer_info_choked_get()),
    remote_interested(libtorrent_jni.peer_info_remote_interested_get()),
    remote_choked(libtorrent_jni.peer_info_remote_choked_get()),
    supports_extensions(libtorrent_jni.peer_info_supports_extensions_get()),
    local_connection(libtorrent_jni.peer_info_local_connection_get()),
    handshake(libtorrent_jni.peer_info_handshake_get()),
    connecting(libtorrent_jni.peer_info_connecting_get()),
    deprecated__(libtorrent_jni.peer_info_deprecated___get()),
    on_parole(libtorrent_jni.peer_info_on_parole_get()),
    seed(libtorrent_jni.peer_info_seed_get()),
    optimistic_unchoke(libtorrent_jni.peer_info_optimistic_unchoke_get()),
    snubbed(libtorrent_jni.peer_info_snubbed_get()),
    upload_only(libtorrent_jni.peer_info_upload_only_get()),
    endgame_mode(libtorrent_jni.peer_info_endgame_mode_get()),
    holepunched(libtorrent_jni.peer_info_holepunched_get()),
    i2p_socket(libtorrent_jni.peer_info_i2p_socket_get()),
    utp_socket(libtorrent_jni.peer_info_utp_socket_get()),
    ssl_socket(libtorrent_jni.peer_info_ssl_socket_get()),
    rc4_encrypted(libtorrent_jni.peer_info_rc4_encrypted_get()),
    plaintext_encrypted(libtorrent_jni.peer_info_plaintext_encrypted_get());

    public final int swigValue() {
      return swigValue;
    }

    public static peer_flags_t swigToEnum(int swigValue) {
      peer_flags_t[] swigValues = peer_flags_t.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (peer_flags_t swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + peer_flags_t.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private peer_flags_t() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private peer_flags_t(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private peer_flags_t(peer_flags_t swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum peer_source_flags {
    tracker(libtorrent_jni.peer_info_tracker_get()),
    dht(libtorrent_jni.peer_info_dht_get()),
    pex(libtorrent_jni.peer_info_pex_get()),
    lsd(libtorrent_jni.peer_info_lsd_get()),
    resume_data(libtorrent_jni.peer_info_resume_data_get()),
    incoming(libtorrent_jni.peer_info_incoming_get());

    public final int swigValue() {
      return swigValue;
    }

    public static peer_source_flags swigToEnum(int swigValue) {
      peer_source_flags[] swigValues = peer_source_flags.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (peer_source_flags swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + peer_source_flags.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private peer_source_flags() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private peer_source_flags(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private peer_source_flags(peer_source_flags swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum connection_type_t {
    standard_bittorrent(libtorrent_jni.peer_info_standard_bittorrent_get()),
    web_seed(libtorrent_jni.peer_info_web_seed_get()),
    http_seed(libtorrent_jni.peer_info_http_seed_get());

    public final int swigValue() {
      return swigValue;
    }

    public static connection_type_t swigToEnum(int swigValue) {
      connection_type_t[] swigValues = connection_type_t.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (connection_type_t swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + connection_type_t.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private connection_type_t() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private connection_type_t(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private connection_type_t(connection_type_t swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum bw_state {
    bw_idle(libtorrent_jni.peer_info_bw_idle_get()),
    bw_limit(libtorrent_jni.peer_info_bw_limit_get()),
    bw_network(libtorrent_jni.peer_info_bw_network_get()),
    bw_disk(libtorrent_jni.peer_info_bw_disk_get());

    public final int swigValue() {
      return swigValue;
    }

    public static bw_state swigToEnum(int swigValue) {
      bw_state[] swigValues = bw_state.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (bw_state swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + bw_state.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private bw_state() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private bw_state(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private bw_state(bw_state swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
