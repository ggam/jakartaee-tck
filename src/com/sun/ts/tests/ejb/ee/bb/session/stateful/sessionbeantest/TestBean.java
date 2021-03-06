/*
 * Copyright (c) 2007, 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

/*
 * $Id$
 */

package com.sun.ts.tests.ejb.ee.bb.session.stateful.sessionbeantest;

import java.rmi.RemoteException;
import java.util.Properties;

import jakarta.ejb.EJBObject;

public interface TestBean extends EJBObject {
  public void ping() throws RemoteException;

  public void setCallBack(CallBack ref) throws RemoteException;

  public boolean isCreateLifeCycle1() throws RemoteException;

  public boolean isCreateLifeCycle2() throws RemoteException;

  public boolean isSyncLifeCycle1(String tx) throws RemoteException;

  public boolean isSyncLifeCycle2(String tx, boolean b1, boolean b2)
      throws RemoteException;

  public boolean isSyncLifeCycle3(String tx, boolean b1, boolean b2)
      throws RemoteException;

  public boolean noSyncLifeCycle(String tx) throws RemoteException;

  public void initLogging(Properties p) throws RemoteException;

  public boolean beginTransaction() throws RemoteException;

  public boolean commitTransaction() throws RemoteException;

  public boolean okay(String tx) throws RemoteException;

  public boolean not_okay(String tx) throws RemoteException;
}
