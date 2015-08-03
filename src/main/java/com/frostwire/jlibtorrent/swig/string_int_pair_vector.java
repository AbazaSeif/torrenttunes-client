/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class string_int_pair_vector {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected string_int_pair_vector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(string_int_pair_vector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_string_int_pair_vector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public string_int_pair_vector() {
    this(libtorrent_jni.new_string_int_pair_vector(), true);
  }

  public long size() {
    return libtorrent_jni.string_int_pair_vector_size(swigCPtr, this);
  }

  public long capacity() {
    return libtorrent_jni.string_int_pair_vector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    libtorrent_jni.string_int_pair_vector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return libtorrent_jni.string_int_pair_vector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    libtorrent_jni.string_int_pair_vector_clear(swigCPtr, this);
  }

  public void add(string_int_pair x) {
    libtorrent_jni.string_int_pair_vector_add(swigCPtr, this, string_int_pair.getCPtr(x), x);
  }

  public string_int_pair get(int i) {
    return new string_int_pair(libtorrent_jni.string_int_pair_vector_get(swigCPtr, this, i), false);
  }

  public void set(int i, string_int_pair val) {
    libtorrent_jni.string_int_pair_vector_set(swigCPtr, this, i, string_int_pair.getCPtr(val), val);
  }

}
