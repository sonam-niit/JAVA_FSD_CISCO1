/**
 * UserServiceImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cisco.soap.service;

public interface UserServiceImpl extends java.rmi.Remote {
    public com.cisco.soap.model.User getUser(java.lang.String userEmail) throws java.rmi.RemoteException;
    public com.cisco.soap.model.User[] getUsers() throws java.rmi.RemoteException;
    public boolean updateUser(com.cisco.soap.model.User user) throws java.rmi.RemoteException;
    public boolean registerUser(com.cisco.soap.model.User user) throws java.rmi.RemoteException;
    public boolean loginUser(com.cisco.soap.model.User user) throws java.rmi.RemoteException;
    public boolean deleteUser(java.lang.String userEmail) throws java.rmi.RemoteException;
}
