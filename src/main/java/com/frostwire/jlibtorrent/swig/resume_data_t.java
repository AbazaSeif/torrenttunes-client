/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class resume_data_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected resume_data_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(resume_data_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_resume_data_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBuf(char_vector value) {
    libtorrent_jni.resume_data_t_buf_set(swigCPtr, this, char_vector.getCPtr(value), value);
  }

  public char_vector getBuf() {
    long cPtr = libtorrent_jni.resume_data_t_buf_get(swigCPtr, this);
    return (cPtr == 0) ? null : new char_vector(cPtr, false);
  }

  public void setNode(bdecode_node value) {
    libtorrent_jni.resume_data_t_node_set(swigCPtr, this, bdecode_node.getCPtr(value), value);
  }

  public bdecode_node getNode() {
    long cPtr = libtorrent_jni.resume_data_t_node_get(swigCPtr, this);
    return (cPtr == 0) ? null : new bdecode_node(cPtr, false);
  }

  public resume_data_t() {
    this(libtorrent_jni.new_resume_data_t(), true);
  }

}
