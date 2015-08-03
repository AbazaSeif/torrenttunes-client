/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class unwanted_block_alert extends peer_alert {
  private long swigCPtr;

  protected unwanted_block_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.unwanted_block_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(unwanted_block_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_unwanted_block_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public unwanted_block_alert(stack_allocator alloc, torrent_handle h, tcp_endpoint ep, sha1_hash peer_id, int block_num, int piece_num) {
    this(libtorrent_jni.new_unwanted_block_alert(stack_allocator.getCPtr(alloc), alloc, torrent_handle.getCPtr(h), h, tcp_endpoint.getCPtr(ep), ep, sha1_hash.getCPtr(peer_id), peer_id, block_num, piece_num), true);
  }

  public int type() {
    return libtorrent_jni.unwanted_block_alert_type(swigCPtr, this);
  }

  public int category() {
    return libtorrent_jni.unwanted_block_alert_category(swigCPtr, this);
  }

  public String what() {
    return libtorrent_jni.unwanted_block_alert_what(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.unwanted_block_alert_message(swigCPtr, this);
  }

  public void setBlock_index(int value) {
    libtorrent_jni.unwanted_block_alert_block_index_set(swigCPtr, this, value);
  }

  public int getBlock_index() {
    return libtorrent_jni.unwanted_block_alert_block_index_get(swigCPtr, this);
  }

  public void setPiece_index(int value) {
    libtorrent_jni.unwanted_block_alert_piece_index_set(swigCPtr, this, value);
  }

  public int getPiece_index() {
    return libtorrent_jni.unwanted_block_alert_piece_index_get(swigCPtr, this);
  }

  public final static int priority = libtorrent_jni.unwanted_block_alert_priority_get();
  public final static int alert_type = libtorrent_jni.unwanted_block_alert_alert_type_get();
}
