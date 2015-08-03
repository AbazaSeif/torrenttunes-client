/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class error_condition {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected error_condition(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(error_condition obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_error_condition(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public error_condition() {
    this(libtorrent_jni.new_error_condition__SWIG_0(), true);
  }

  public error_condition(int val, error_category cat) {
    this(libtorrent_jni.new_error_condition__SWIG_1(val, error_category.getCPtr(cat), cat), true);
  }

  public void assign(int val, error_category cat) {
    libtorrent_jni.error_condition_assign(swigCPtr, this, val, error_category.getCPtr(cat), cat);
  }

  public void clear() {
    libtorrent_jni.error_condition_clear(swigCPtr, this);
  }

  public int value() {
    return libtorrent_jni.error_condition_value(swigCPtr, this);
  }

  public error_category category() {
    return new error_category(libtorrent_jni.error_condition_category(swigCPtr, this), false);
  }

  public String message() {
    return libtorrent_jni.error_condition_message(swigCPtr, this);
  }

  public static void unspecified_bool_true() {
    libtorrent_jni.error_condition_unspecified_bool_true();
  }

}
