/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class tracker_announce_alert extends tracker_alert {
  private long swigCPtr;

  protected tracker_announce_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.tracker_announce_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(tracker_announce_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_tracker_announce_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public tracker_announce_alert(stack_allocator alloc, torrent_handle h, String u, int e) {
    this(libtorrent_jni.new_tracker_announce_alert(stack_allocator.getCPtr(alloc), alloc, torrent_handle.getCPtr(h), h, u, e), true);
  }

  public int type() {
    return libtorrent_jni.tracker_announce_alert_type(swigCPtr, this);
  }

  public int category() {
    return libtorrent_jni.tracker_announce_alert_category(swigCPtr, this);
  }

  public String what() {
    return libtorrent_jni.tracker_announce_alert_what(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.tracker_announce_alert_message(swigCPtr, this);
  }

  public void setEvent(int value) {
    libtorrent_jni.tracker_announce_alert_event_set(swigCPtr, this, value);
  }

  public int getEvent() {
    return libtorrent_jni.tracker_announce_alert_event_get(swigCPtr, this);
  }

  public final static int priority = libtorrent_jni.tracker_announce_alert_priority_get();
  public final static int alert_type = libtorrent_jni.tracker_announce_alert_alert_type_get();
}
