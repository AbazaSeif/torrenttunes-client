/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class storage_params {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected storage_params(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(storage_params obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_storage_params(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public storage_params() {
    this(libtorrent_jni.new_storage_params(), true);
  }

  public void setFiles(file_storage value) {
    libtorrent_jni.storage_params_files_set(swigCPtr, this, file_storage.getCPtr(value), value);
  }

  public file_storage getFiles() {
    long cPtr = libtorrent_jni.storage_params_files_get(swigCPtr, this);
    return (cPtr == 0) ? null : new file_storage(cPtr, false);
  }

  public void setMapped_files(file_storage value) {
    libtorrent_jni.storage_params_mapped_files_set(swigCPtr, this, file_storage.getCPtr(value), value);
  }

  public file_storage getMapped_files() {
    long cPtr = libtorrent_jni.storage_params_mapped_files_get(swigCPtr, this);
    return (cPtr == 0) ? null : new file_storage(cPtr, false);
  }

  public void setPath(String value) {
    libtorrent_jni.storage_params_path_set(swigCPtr, this, value);
  }

  public String getPath() {
    return libtorrent_jni.storage_params_path_get(swigCPtr, this);
  }

  public void setMode(storage_mode_t value) {
    libtorrent_jni.storage_params_mode_set(swigCPtr, this, value.swigValue());
  }

  public storage_mode_t getMode() {
    return storage_mode_t.swigToEnum(libtorrent_jni.storage_params_mode_get(swigCPtr, this));
  }

  public void setPriorities(unsigned_char_vector value) {
    libtorrent_jni.storage_params_priorities_set(swigCPtr, this, unsigned_char_vector.getCPtr(value), value);
  }

  public unsigned_char_vector getPriorities() {
    long cPtr = libtorrent_jni.storage_params_priorities_get(swigCPtr, this);
    return (cPtr == 0) ? null : new unsigned_char_vector(cPtr, false);
  }

  public void setInfo(torrent_info value) {
    libtorrent_jni.storage_params_info_set(swigCPtr, this, torrent_info.getCPtr(value), value);
  }

  public torrent_info getInfo() {
    long cPtr = libtorrent_jni.storage_params_info_get(swigCPtr, this);
    return (cPtr == 0) ? null : new torrent_info(cPtr, true);
  }

}
