/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class proxy_settings {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected proxy_settings(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(proxy_settings obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_proxy_settings(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setHostname(String value) {
    libtorrent_jni.proxy_settings_hostname_set(swigCPtr, this, value);
  }

  public String getHostname() {
    return libtorrent_jni.proxy_settings_hostname_get(swigCPtr, this);
  }

  public void setUsername(String value) {
    libtorrent_jni.proxy_settings_username_set(swigCPtr, this, value);
  }

  public String getUsername() {
    return libtorrent_jni.proxy_settings_username_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    libtorrent_jni.proxy_settings_password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return libtorrent_jni.proxy_settings_password_get(swigCPtr, this);
  }

  public void setType(short value) {
    libtorrent_jni.proxy_settings_type_set(swigCPtr, this, value);
  }

  public short getType() {
    return libtorrent_jni.proxy_settings_type_get(swigCPtr, this);
  }

  public void setPort(int value) {
    libtorrent_jni.proxy_settings_port_set(swigCPtr, this, value);
  }

  public int getPort() {
    return libtorrent_jni.proxy_settings_port_get(swigCPtr, this);
  }

  public void setProxy_hostnames(boolean value) {
    libtorrent_jni.proxy_settings_proxy_hostnames_set(swigCPtr, this, value);
  }

  public boolean getProxy_hostnames() {
    return libtorrent_jni.proxy_settings_proxy_hostnames_get(swigCPtr, this);
  }

  public void setProxy_peer_connections(boolean value) {
    libtorrent_jni.proxy_settings_proxy_peer_connections_set(swigCPtr, this, value);
  }

  public boolean getProxy_peer_connections() {
    return libtorrent_jni.proxy_settings_proxy_peer_connections_get(swigCPtr, this);
  }

}
