/*
 * anaptecs GmbH, Ricarda-Huch-Str. 71, 72760 Reutlingen, Germany
 *
 * Copyright 2004 - 2020. All rights reserved.
 */
package com.anaptecs.jeaf.spi.identity;

/**
 * Enumeration defines the possible states of an identity.
 *
 * @author JEAF Generator
 * @version JEAF Release 1.4.x
 */
public enum IdentityState {
  /**
   * Identity is active.
   */
  ACTIVE,
  /**
   * Identity is disabled by identity provider. No logins are possible.
   */
  DISABLED;
}