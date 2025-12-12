/*
 * anaptecs GmbH, Ricarda-Huch-Str. 71, 72760 Reutlingen, Germany
 *
 * Copyright 2004 - 2020. All rights reserved.
 */
package com.anaptecs.jeaf.spi.identity;

import java.util.List;

import javax.security.auth.login.LoginException;

import com.anaptecs.jeaf.core.api.ServiceProvider;
import com.anaptecs.jeaf.xfun.api.errorhandling.FailureMessage;

/**
 * A Identity Service Provider is responsible for accessing users that are managed by some identity provider.
 *
 * @author JEAF Generator
 * @version JEAF Release 1.4.x
 */
public interface IdentityServiceProvider extends ServiceProvider {
  /**
   * Method performs a query for users that match to the passed query criteria.
   *
   * @param pQuery Criteria of the query for identities. The parameter must not be null.
   * @param pContext Context information that may be used to access a specific identity provider service. The parameter
   * must not be null.
   * @return {@link List<Identity>}
   */
  List<Identity> queryIdentities( IdentityQuery pQuery, IdentityProviderContext pContext )
    throws IdentityProviderSystemException;

  /**
   * Method tries to login the users with the passed credentials. The login will be performed based on the passed
   * identity provider context which may contain details about the identity provider server. If the login fails an
   * exception will be thrown.
   *
   * @param pLoginname Login name of the user who wants to login. The parameter must not be null.
   * @param pPassword Password of the user. The parameter must not be null.
   * @param pContext Context information that may be used to access a specific identity provider service. The parameter
   * must not be null.
   * @return {@link Identity} Object describing the logged in identity. The method never returns null. If the login
   * fails an exception will be thrown.
   */
  Identity login( String pLoginname, String pPassword, IdentityProviderContext pContext )
    throws LoginException, IdentityProviderSystemException;

  /**
   * Method changes the password of the passed identity to the new one.
   *
   * @param pIdentity Identity defining the user whose password should be changed. The parameter must not be null.
   * @param pOldPassword Current password of the user. The parameter must not be null.
   * @param pNewPassword New unencrypted password. The parameter must not be null and must match with the password
   * guidelines of the uses identity service provider.
   * @param pContext Context information that may be used to access a specific identity provider service. The parameter
   * must not be null.
   * @return boolean
   */
  boolean changePassword( Identity pIdentity, String pOldPassword, String pNewPassword,
      IdentityProviderContext pContext )
    throws IdentityProviderSystemException;

  /**
   * Method registers the passed identity. What registration exactly means depends highly on the concrete
   * implementation.
   *
   * @param pIdentity Object describes the identity that should be registered. The parameter must not be null.
   * @param pPassword Password of the new identity. The password must match to the guidelines that are defined for the
   * used identity service provider.
   * @param pRegistrationMode The registration mode defines the expected behavior for the identity provider. The
   * parameter must not be null.
   * @param pContext Context information that may be used to access a specific identity provider service. The parameter
   * must not be null.
   * @return {@link Identity} Identity object with the current information about the identity. The method never returns
   * null.
   */
  Identity register( Identity pIdentity, String pPassword, RegistrationMode pRegistrationMode,
      IdentityProviderContext pContext )
    throws IdentityProviderSystemException;

  /**
   * Method resets the password of the passed user to the new value.
   *
   * @param pIdentity Identity whose password should be reset.
   * @param pNewPassword New password which should be set for the passed user. The password must match to the guidelines
   * that are defined for the user identity service provider. The parameter must not be null.
   * @param pContext Context information that may be used to access a specific identity provider service. The parameter
   * must not be null.
   */
  void resetPassword( Identity pIdentity, String pNewPassword, IdentityProviderContext pContext );

  /**
   * Method tests the connection through this IdentityServiceProvider using the passed context. If the connection test
   * fails an exception will be thrown.
   *
   * @param pContext Context describing to concrete instance against which the connection test should be run. The
   * parameter must not be null.
   * @return {@link FailureMessage} Method returns null if the test was successful and a failure object in all other
   * cases.
   */
  FailureMessage testConnection( IdentityProviderContext pContext );

  /**
   * Method tells the caller if this identity provider supports logins of identities.
   *
   * @return boolean Method returns true if this implementation supports logins and false in all other cases.
   */
  boolean supportsLogin( );

  /**
   * Method tells the caller if this identity provider supports queries for identities.
   *
   * @return boolean Method returns true if this implementation supports queries and false in all other cases.
   */
  boolean supportsQuery( );

  /**
   * Method tells the caller if this identity provider supports registration of new identities. &quot;new&quot; in this
   * case means that the identity does not yet exist in the connected identity service.
   *
   * @return boolean Method returns true if this implementation supports new registrations and false in all other cases.
   */
  boolean supportsNewRegistration( );

  /**
   * Method tells the caller if this identity provider supports registration of identities that already exist in the
   * connected service.
   *
   * @return boolean Method returns true if this implementation supports existing registrations and false in all other
   * cases.
   */
  boolean supportsExistingRegistration( );

  /**
   * Method tells the caller if this identity provider supports change of passwords for identities.
   *
   * @return boolean Method returns true if this implementation supports password changes and false in all other cases.
   */
  boolean supportsPasswordChange( );

  /**
   * Method tells the caller if this identity provider supports reset of passwords for identities.
   *
   * @return boolean Method returns true if this implementation supports password reset and false in all other cases.
   */
  boolean supportsResetPassword( );
}