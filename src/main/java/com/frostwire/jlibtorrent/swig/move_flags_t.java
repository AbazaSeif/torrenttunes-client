/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public enum move_flags_t {
  always_replace_files,
  fail_if_exist,
  dont_replace;

  public final int swigValue() {
    return swigValue;
  }

  public static move_flags_t swigToEnum(int swigValue) {
    move_flags_t[] swigValues = move_flags_t.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (move_flags_t swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + move_flags_t.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private move_flags_t() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private move_flags_t(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private move_flags_t(move_flags_t swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

