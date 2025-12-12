/*
 * anaptecs GmbH, Ricarda-Huch-Str. 71, 72760 Reutlingen, Germany
 *
 * Copyright 2004 - 2020. All rights reserved.
 */
package com.anaptecs.jeaf.spi.identity;

/**
 * Enumeration defines the possible behaviors of a identity provider when a user is registered.
 *
 * @author JEAF Generator
 * @version JEAF Release 1.4.x
 */
public enum RegistrationMode {
  /**
   * With this registration mode the identity provider should try to create a new identity on registration.
   */
  ADD_NEW_IDENTITY,
  /**
   * With this registration mode the identity provider should check if the passed identity already exist when trying to
   * register.
   */
  IDENTITY_MUST_EXIST;
}