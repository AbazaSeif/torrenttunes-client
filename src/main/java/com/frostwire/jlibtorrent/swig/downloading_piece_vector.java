/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class downloading_piece_vector {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected downloading_piece_vector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(downloading_piece_vector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_downloading_piece_vector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public downloading_piece_vector() {
    this(libtorrent_jni.new_downloading_piece_vector(), true);
  }

  public long size() {
    return libtorrent_jni.downloading_piece_vector_size(swigCPtr, this);
  }

  public long capacity() {
    return libtorrent_jni.downloading_piece_vector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    libtorrent_jni.downloading_piece_vector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return libtorrent_jni.downloading_piece_vector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    libtorrent_jni.downloading_piece_vector_clear(swigCPtr, this);
  }

  public void add(piece_picker.downloading_piece x) {
    libtorrent_jni.downloading_piece_vector_add(swigCPtr, this, piece_picker.downloading_piece.getCPtr(x), x);
  }

  public piece_picker.downloading_piece get(int i) {
    return new piece_picker.downloading_piece(libtorrent_jni.downloading_piece_vector_get(swigCPtr, this, i), false);
  }

  public void set(int i, piece_picker.downloading_piece val) {
    libtorrent_jni.downloading_piece_vector_set(swigCPtr, this, i, piece_picker.downloading_piece.getCPtr(val), val);
  }

}
