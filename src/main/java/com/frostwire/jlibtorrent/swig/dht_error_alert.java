/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class dht_error_alert extends alert {
  private long swigCPtr;

  protected dht_error_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.dht_error_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(dht_error_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_dht_error_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public dht_error_alert(stack_allocator alloc, int op, error_code ec) {
    this(libtorrent_jni.new_dht_error_alert(stack_allocator.getCPtr(alloc), alloc, op, error_code.getCPtr(ec), ec), true);
  }

  public int type() {
    return libtorrent_jni.dht_error_alert_type(swigCPtr, this);
  }

  public int category() {
    return libtorrent_jni.dht_error_alert_category(swigCPtr, this);
  }

  public String what() {
    return libtorrent_jni.dht_error_alert_what(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.dht_error_alert_message(swigCPtr, this);
  }

  public void setError(error_code value) {
    libtorrent_jni.dht_error_alert_error_set(swigCPtr, this, error_code.getCPtr(value), value);
  }

  public error_code getError() {
    long cPtr = libtorrent_jni.dht_error_alert_error_get(swigCPtr, this);
    return (cPtr == 0) ? null : new error_code(cPtr, false);
  }

  public void setOperation(dht_error_alert.op_t value) {
    libtorrent_jni.dht_error_alert_operation_set(swigCPtr, this, value.swigValue());
  }

  public dht_error_alert.op_t getOperation() {
    return dht_error_alert.op_t.swigToEnum(libtorrent_jni.dht_error_alert_operation_get(swigCPtr, this));
  }

  public final static int priority = libtorrent_jni.dht_error_alert_priority_get();
  public final static int alert_type = libtorrent_jni.dht_error_alert_alert_type_get();
  public final static int static_category = libtorrent_jni.dht_error_alert_static_category_get();
  public enum op_t {
    unknown,
    hostname_lookup;

    public final int swigValue() {
      return swigValue;
    }

    public static op_t swigToEnum(int swigValue) {
      op_t[] swigValues = op_t.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (op_t swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + op_t.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private op_t() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private op_t(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private op_t(op_t swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
