package com.anaptecs.jeaf.spi.identity;

import com.anaptecs.jeaf.xfun.annotations.MessageResource;
import com.anaptecs.jeaf.xfun.api.XFun;
import com.anaptecs.jeaf.xfun.api.errorhandling.ErrorCode;
import com.anaptecs.jeaf.xfun.api.messages.MessageID;
import com.anaptecs.jeaf.xfun.api.messages.MessageRepository;

/**
 * Class contains all generated constants for JEAF Security.
 *
 * @author JEAF Development Team
 * @version 1.0
 */
@MessageResource(path = "IdentityServiceProviderMessages.xml")
public final class IdentityServiceProviderMessages {
  /**
   * Constant for XML file that contains all messages that are defined within this class.
   */
  private static final String MESSAGE_RESOURCE = "IdentityServiceProviderMessages.xml";

  /**
   * Exceptions with this error code are thrown if the connect to an active directory fails.
   */
  public static final ErrorCode COMMUNICATION_ERROR_TO_AD;

  /**
   * Exceptions with this error code are thrown if the connect to an active directory fails.
   */
  public static final ErrorCode USER_LOOKUP_FAILED;

  /**
   * Exceptions with this error code are thrown if a user could not be found in Active Directory.
   */
  public static final ErrorCode USER_NOT_FOUND;

  /**
   * Exceptions with this error code are thrown if the connect to an active directory fails.
   */
  public static final ErrorCode USER_QUERY_FAILED;

  /**
   * Exceptions with this error code are thrown if an exception occurs when trying to close connection to active
   * directory server.
   */
  public static final ErrorCode ERROR_ON_CLOSE_CONNECTION;

  /**
   * Exceptions with this error code are thrown if an exception occurs when trying to close connection to active
   * directory server.
   */
  public static final MessageID EXECUTING_AD_QUERY;

  /**
   * Exceptions with this error code are thrown if a new user should be created in active directory server during
   * registration.
   */
  public static final ErrorCode CREATING_AD_USERS_NOT_SUPPORTED;

  /**
   * Exceptions with this error code are thrown if a new user should be created in active directory server during
   * registration.
   */
  public static final ErrorCode LOGIN_TO_AD_FAILED;

  /**
   * Exceptions with this error code are thrown if a new user tries to change his active directory password.
   */
  public static final ErrorCode AD_PASSWORD_CHANGE_NOT_SUPPORTED;

  /**
   * Exceptions with this error code are thrown if a connect to an Active Directory fails.
   */
  public static final ErrorCode AD_AUTHENTICATION_ERROR;

  /**
   * Exceptions with this error code are thrown if a query in active directory contains unprocessed references.
   */
  public static final ErrorCode UNPROCESSED_REFERENCES;

  /**
   * Exceptions with this error code are thrown if a lookup for users fails..
   */
  public static final ErrorCode DB_CONNECTION_ERROR;

  /**
   * Exceptions with this error code are thrown if a lookup for users fails..
   */
  public static final ErrorCode USER_NOT_FOUND_IN_JEAF_IDP;

  /**
   * Exceptions with this error code are thrown if a new user should be created in JEAF IDP during registration.
   */
  public static final ErrorCode CREATING_JEAF_IDP_USERS_NOT_SUPPORTED;

  /**
   * Exceptions with this error code are thrown if a new user should be created in a SAML based identitiy provider
   * during registration.
   */
  public static final ErrorCode CREATING_SAML_USERS_NOT_SUPPORTED;

  /**
   * Exceptions with this error code are thrown if a new user tries to change his SAML password.
   */
  public static final ErrorCode SAML_PASSWORD_CHANGE_NOT_SUPPORTED;

  /**
   * Exceptions with this error code are thrown if a new user should be created in a SAML based identitiy provider
   * during registration.
   */
  public static final ErrorCode SAML_USERS_QUERY_NOT_SUPPORTED;

  /**
   * Exceptions with this error code are thrown if a invalid saml token is passed on a login.
   */
  public static final ErrorCode SAML_TOKEN_INVALID;

  /**
   * Exceptions with this error code are thrown if a invalid saml token is passed on a login.
   */
  public static final ErrorCode SAML_LOGIN_NAME_MISSING;

  /**
   * Exceptions with this error code are thrown if a invalid saml token is passed on a login.
   */
  public static final ErrorCode SAML_VALIDITY_CHECK_DISABLED;

  /**
   * Exceptions with this error code are thrown if user name and SAML token do not match.
   */
  public static final ErrorCode SAML_LOGIN_TOKEN_MISMATCH;

  /**
   * Exceptions with this error code are thrown if a new user should be created in a SAML based identitiy provider
   * during registration.
   */
  public static final ErrorCode CREATING_OAUTH_USERS_NOT_SUPPORTED;

  /**
   * Exceptions with this error code are thrown if a new user tries to change his SAML password.
   */
  public static final ErrorCode OAUTH_PASSWORD_CHANGE_NOT_SUPPORTED;

  /**
   * Exceptions with this error code are thrown if a new user should be created in a SAML based identitiy provider
   * during registration.
   */
  public static final ErrorCode OAUTH_USERS_QUERY_NOT_SUPPORTED;

  /**
   * Exceptions with this error code are thrown if a new user tries to change his SAML password.
   */
  public static final ErrorCode OAUTH_REQUEST_FAILED;

  /**
   *
   */
  public static final MessageID OAUTH_PROVIDER_REQUEST;

  /**
   *
   */
  public static final MessageID OAUTH_PROVIDER_RESPONSE;

  /**
   *
   */
  public static final MessageID OAUTH_BODY;

  /**
   * Exceptions with this error code are thrown if a requested db property is not defined.
   */
  public static final ErrorCode INVALID_PROVIDER_CERTIFICATE;
  /**
   * Static initializer contains initialization for all generated constants.
   */
  static {
    MessageRepository lRepository = XFun.getMessageRepository();
    lRepository.loadResource(MESSAGE_RESOURCE);
    // Handle all info messages.
    EXECUTING_AD_QUERY = lRepository.getMessageID(3005);
    OAUTH_PROVIDER_REQUEST = lRepository.getMessageID(3025);
    OAUTH_PROVIDER_RESPONSE = lRepository.getMessageID(3026);
    OAUTH_BODY = lRepository.getMessageID(3027);
    // Handle all messages for errors.
    COMMUNICATION_ERROR_TO_AD = lRepository.getErrorCode(3000);
    USER_LOOKUP_FAILED = lRepository.getErrorCode(3001);
    USER_NOT_FOUND = lRepository.getErrorCode(3002);
    USER_QUERY_FAILED = lRepository.getErrorCode(3003);
    ERROR_ON_CLOSE_CONNECTION = lRepository.getErrorCode(3004);
    CREATING_AD_USERS_NOT_SUPPORTED = lRepository.getErrorCode(3006);
    LOGIN_TO_AD_FAILED = lRepository.getErrorCode(3007);
    AD_PASSWORD_CHANGE_NOT_SUPPORTED = lRepository.getErrorCode(3008);
    AD_AUTHENTICATION_ERROR = lRepository.getErrorCode(3009);
    UNPROCESSED_REFERENCES = lRepository.getErrorCode(3010);
    DB_CONNECTION_ERROR = lRepository.getErrorCode(3011);
    USER_NOT_FOUND_IN_JEAF_IDP = lRepository.getErrorCode(3012);
    CREATING_JEAF_IDP_USERS_NOT_SUPPORTED = lRepository.getErrorCode(3013);
    CREATING_SAML_USERS_NOT_SUPPORTED = lRepository.getErrorCode(3014);
    SAML_PASSWORD_CHANGE_NOT_SUPPORTED = lRepository.getErrorCode(3015);
    SAML_USERS_QUERY_NOT_SUPPORTED = lRepository.getErrorCode(3016);
    SAML_TOKEN_INVALID = lRepository.getErrorCode(3017);
    SAML_LOGIN_NAME_MISSING = lRepository.getErrorCode(3018);
    SAML_VALIDITY_CHECK_DISABLED = lRepository.getErrorCode(3019);
    SAML_LOGIN_TOKEN_MISMATCH = lRepository.getErrorCode(3020);
    CREATING_OAUTH_USERS_NOT_SUPPORTED = lRepository.getErrorCode(3021);
    OAUTH_PASSWORD_CHANGE_NOT_SUPPORTED = lRepository.getErrorCode(3022);
    OAUTH_USERS_QUERY_NOT_SUPPORTED = lRepository.getErrorCode(3023);
    OAUTH_REQUEST_FAILED = lRepository.getErrorCode(3024);
    INVALID_PROVIDER_CERTIFICATE = lRepository.getErrorCode(3028);
    // Handle all localized strings.
  }

  /**
   * Constructor is private to ensure that no instances of this class will be created.
   */
  private IdentityServiceProviderMessages( ) {
    // Nothing to do.
  }
}