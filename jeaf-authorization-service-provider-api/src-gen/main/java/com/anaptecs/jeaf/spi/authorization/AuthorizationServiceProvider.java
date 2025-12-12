/*
 * anaptecs GmbH, Ricarda-Huch-Str. 71, 72760 Reutlingen, Germany
 *
 * Copyright 2004 - 2020. All rights reserved.
 */
package com.anaptecs.jeaf.spi.authorization;

import com.anaptecs.jeaf.core.api.ServiceProvider;

/**
 * JEAF Authorization Service Provider is responsible for enabling business components to check security as simple as
 * possible. JEAF provides a rather simple authorization concept to use. But behind the scenes it is quite powerful. For
 * every method of an JEAF Service there will be an individual authorization type. This ensures that access privileges
 * can be granted rather fine. In oder to ease administration authorization types can be put together as roles which are
 * assigned to users.<br/>
 * <br/>
 * Since authentication is already handled by JAAS LoginModules and their integration into JEE Application Servers, JEAF
 * does not deal that much with authentication and concentrates on authorization.
 *
 * @author JEAF Generator
 * @version JEAF Release 1.4.x
 */
public interface AuthorizationServiceProvider extends ServiceProvider {
  /**
   * Method checks whether the current user has the authorization of the passed type.
   *
   * @param pAuthorizationTypeName Name of the authorization type that the current user should have. The parameter must
   * not be null.
   * @return boolean Method returns true if the authorization check was successful and false in all other cases.
   */
  boolean hasAuthorization( String pAuthorizationTypeName );

  /**
   * Method checks whether the current user has right now the authorization that is described by the passed
   * authorization type. This method enforces that the user has the required authorization . If the check is negative an
   * exception due to insufficient privileges will be thrown.
   *
   * @param pAuthorizationTypeName Name of the authorization type for which the check will be performed. The parameter
   * must not be null.
   */
  void enforceAuthorization( String pAuthorizationTypeName ) throws AuthorizationException;
}