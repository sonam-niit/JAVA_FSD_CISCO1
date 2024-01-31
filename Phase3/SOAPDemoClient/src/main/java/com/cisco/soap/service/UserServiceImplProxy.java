package com.cisco.soap.service;

public class UserServiceImplProxy implements com.cisco.soap.service.UserServiceImpl {
  private String _endpoint = null;
  private com.cisco.soap.service.UserServiceImpl userServiceImpl = null;
  
  public UserServiceImplProxy() {
    _initUserServiceImplProxy();
  }
  
  public UserServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initUserServiceImplProxy();
  }
  
  private void _initUserServiceImplProxy() {
    try {
      userServiceImpl = (new com.cisco.soap.service.UserServiceImplServiceLocator()).getUserServiceImpl();
      if (userServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)userServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)userServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (userServiceImpl != null)
      ((javax.xml.rpc.Stub)userServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.cisco.soap.service.UserServiceImpl getUserServiceImpl() {
    if (userServiceImpl == null)
      _initUserServiceImplProxy();
    return userServiceImpl;
  }
  
  public com.cisco.soap.model.User getUser(java.lang.String userEmail) throws java.rmi.RemoteException{
    if (userServiceImpl == null)
      _initUserServiceImplProxy();
    return userServiceImpl.getUser(userEmail);
  }
  
  public com.cisco.soap.model.User[] getUsers() throws java.rmi.RemoteException{
    if (userServiceImpl == null)
      _initUserServiceImplProxy();
    return userServiceImpl.getUsers();
  }
  
  public boolean updateUser(com.cisco.soap.model.User user) throws java.rmi.RemoteException{
    if (userServiceImpl == null)
      _initUserServiceImplProxy();
    return userServiceImpl.updateUser(user);
  }
  
  public boolean registerUser(com.cisco.soap.model.User user) throws java.rmi.RemoteException{
    if (userServiceImpl == null)
      _initUserServiceImplProxy();
    return userServiceImpl.registerUser(user);
  }
  
  public boolean loginUser(com.cisco.soap.model.User user) throws java.rmi.RemoteException{
    if (userServiceImpl == null)
      _initUserServiceImplProxy();
    return userServiceImpl.loginUser(user);
  }
  
  public boolean deleteUser(java.lang.String userEmail) throws java.rmi.RemoteException{
    if (userServiceImpl == null)
      _initUserServiceImplProxy();
    return userServiceImpl.deleteUser(userEmail);
  }
  
  
}