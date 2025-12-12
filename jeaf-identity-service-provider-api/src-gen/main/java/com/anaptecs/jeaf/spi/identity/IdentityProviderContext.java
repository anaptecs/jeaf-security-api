/*
 * anaptecs GmbH, Ricarda-Huch-Str. 71, 72760 Reutlingen, Germany
 *
 * Copyright 2004 - 2020. All rights reserved.
 */
package com.anaptecs.jeaf.spi.identity;

import javax.validation.ConstraintViolationException;

import com.anaptecs.jeaf.core.api.ServiceObject;
import com.anaptecs.jeaf.tools.api.validation.ValidationTools;
import com.anaptecs.jeaf.xfun.api.checks.Check;

/**
 * Class defines the context information that may be required to access an identity provider.
 *
 * @author JEAF Generator
 * @version JEAF Release 1.4.x
 */
public class IdentityProviderContext implements ServiceObject {
  /**
   * Default serial version uid.
   */
  private static final long serialVersionUID = 1L;

  /**
   * Constant for the name of attribute "providerURL".
   */
  public static final String PROVIDERURL = "providerURL";

  /**
   * Constant for the name of attribute "searchBase".
   */
  public static final String SEARCHBASE = "searchBase";

  /**
   * Constant for the name of attribute "domain".
   */
  public static final String DOMAIN = "domain";

  /**
   * Constant for the name of attribute "user".
   */
  public static final String USER = "user";

  /**
   * Constant for the name of attribute "password".
   */
  public static final String PASSWORD = "password";

  /**
   * Constant for the name of attribute "connectTimeout".
   */
  public static final String CONNECTTIMEOUT = "connectTimeout";

  /**
   * Constant for the name of attribute "readTimeout".
   */
  public static final String READTIMEOUT = "readTimeout";

  /**
   * Constant for the name of attribute "acceptAllCertificates".
   */
  public static final String ACCEPTALLCERTIFICATES = "acceptAllCertificates";

  /**
   * Constant for the name of attribute "providerCertificate".
   */
  public static final String PROVIDERCERTIFICATE = "providerCertificate";

  /**
   * Constant for the name of attribute "disableValidityCheck".
   */
  public static final String DISABLEVALIDITYCHECK = "disableValidityCheck";

  /**
   * Constant for the name of attribute "clientSecret".
   */
  public static final String CLIENTSECRET = "clientSecret";

  /**
   * Constant for the name of attribute "allowEMailLogin".
   */
  public static final String ALLOWEMAILLOGIN = "allowEMailLogin";

  /**
   * URL of the server of the identity provider e.g. &quot;ldaps://cloud.weeasy.de&quot;
   */
  private String providerURL;

  /**
   * Optional attribute defines the search base for accessing identities. This attribute is required in case od ldap
   * based identity providers.
   */
  private String searchBase;

  /**
   * Domain to which the identity provider server belongs to.
   */
  private String domain;

  /**
   * Technical user that should be used to access the identity provider. The attribute may be null.
   */
  private String user;

  /**
   * Password of the technical user that should be used to access the identity provider. The attribute may be null.
   */
  private String password;

  /**
   * Connection timeout when trying to access the identity provider. The attribute may be null.
   */
  private Integer connectTimeout;

  /**
   * Read timeout for queries using the identity provider. The attribute may be null.
   */
  private Integer readTimeout;

  /**
   * If attribute is set to true then all SSL certificates are accepted not matter if they are valid or not. This
   * feature is intended to be used in non production environments.
   */
  private Boolean acceptAllCertificates;

  /**
   * Certificate of the identity provider.
   */
  private String providerCertificate;

  /**
   * Attributes defines whether a may be exiting validity check should be disabled. This feature is intended only to be
   * used for testing but never in production environments.
   */
  private boolean disableValidityCheck;

  /**
   * Client secret is used in case of OAuth.
   */
  private String clientSecret;

  /**
   * true if login with the email address is allowed, otherwise false.
   */
  private Boolean allowEMailLogin;

  /**
   * Default constructor is only intended to be used for deserialization by tools like Jackson for JSON. For "normal"
   * object creation builder should be used instead.
   */
  protected IdentityProviderContext( ) {
  }

  /**
   * Initialize object using the passed builder.
   *
   * @param pBuilder Builder that should be used to initialize this object. The parameter must not be null.
   */
  protected IdentityProviderContext( Builder pBuilder ) {
    // Ensure that builder is not null.
    Check.checkInvalidParameterNull(pBuilder, "pBuilder");
    // Read attribute values from builder.
    providerURL = pBuilder.providerURL;
    searchBase = pBuilder.searchBase;
    domain = pBuilder.domain;
    user = pBuilder.user;
    password = pBuilder.password;
    connectTimeout = pBuilder.connectTimeout;
    readTimeout = pBuilder.readTimeout;
    acceptAllCertificates = pBuilder.acceptAllCertificates;
    providerCertificate = pBuilder.providerCertificate;
    disableValidityCheck = pBuilder.disableValidityCheck;
    clientSecret = pBuilder.clientSecret;
    allowEMailLogin = pBuilder.allowEMailLogin;
  }

  /**
   * Method returns a new builder.
   *
   * @return {@link Builder} New builder that can be used to create new IdentityProviderContext objects.
   */
  public static Builder builder( ) {
    return new Builder();
  }

  /**
   * Class implements builder to create a new instance of class <code>IdentityProviderContext</code>.
   */
  public static class Builder {
    /**
     * URL of the server of the identity provider e.g. &quot;ldaps://cloud.weeasy.de&quot;
     */
    private String providerURL;

    /**
     * Optional attribute defines the search base for accessing identities. This attribute is required in case od ldap
     * based identity providers.
     */
    private String searchBase;

    /**
     * Domain to which the identity provider server belongs to.
     */
    private String domain;

    /**
     * Technical user that should be used to access the identity provider. The attribute may be null.
     */
    private String user;

    /**
     * Password of the technical user that should be used to access the identity provider. The attribute may be null.
     */
    private String password;

    /**
     * Connection timeout when trying to access the identity provider. The attribute may be null.
     */
    private Integer connectTimeout;

    /**
     * Read timeout for queries using the identity provider. The attribute may be null.
     */
    private Integer readTimeout;

    /**
     * If attribute is set to true then all SSL certificates are accepted not matter if they are valid or not. This
     * feature is intended to be used in non production environments.
     */
    private Boolean acceptAllCertificates;

    /**
     * Certificate of the identity provider.
     */
    private String providerCertificate;

    /**
     * Attributes defines whether a may be exiting validity check should be disabled. This feature is intended only to
     * be used for testing but never in production environments.
     */
    private boolean disableValidityCheck;

    /**
     * Client secret is used in case of OAuth.
     */
    private String clientSecret;

    /**
     * true if login with the email address is allowed, otherwise false.
     */
    private Boolean allowEMailLogin;

    /**
     * Use {@link IdentityProviderContext#builder()} instead of private constructor to create new builder.
     */
    protected Builder( ) {
    }

    /**
     * Use {@link IdentityProviderContext#builder(IdentityProviderContext)} instead of private constructor to create new
     * builder.
     */
    protected Builder( IdentityProviderContext pObject ) {
      if (pObject != null) {
        // Read attribute values from passed object.
        this.setProviderURL(pObject.providerURL);
        this.setSearchBase(pObject.searchBase);
        this.setDomain(pObject.domain);
        this.setUser(pObject.user);
        this.setPassword(pObject.password);
        this.setConnectTimeout(pObject.connectTimeout);
        this.setReadTimeout(pObject.readTimeout);
        this.setAcceptAllCertificates(pObject.acceptAllCertificates);
        this.setProviderCertificate(pObject.providerCertificate);
        this.setDisableValidityCheck(pObject.disableValidityCheck);
        this.setClientSecret(pObject.clientSecret);
        this.setAllowEMailLogin(pObject.allowEMailLogin);
      }
    }

    /**
     * Method sets attribute {@link #providerURL}.<br/>
     *
     * @param pProviderURL Value to which {@link #providerURL} should be set.
     * @return {@link Builder} Instance of this builder to support chaining setters. Method never returns null.
     */
    public Builder setProviderURL( String pProviderURL ) {
      // Assign value to attribute
      providerURL = pProviderURL;
      return this;
    }

    /**
     * Method sets attribute {@link #searchBase}.<br/>
     *
     * @param pSearchBase Value to which {@link #searchBase} should be set.
     * @return {@link Builder} Instance of this builder to support chaining setters. Method never returns null.
     */
    public Builder setSearchBase( String pSearchBase ) {
      // Assign value to attribute
      searchBase = pSearchBase;
      return this;
    }

    /**
     * Method sets attribute {@link #domain}.<br/>
     *
     * @param pDomain Value to which {@link #domain} should be set.
     * @return {@link Builder} Instance of this builder to support chaining setters. Method never returns null.
     */
    public Builder setDomain( String pDomain ) {
      // Assign value to attribute
      domain = pDomain;
      return this;
    }

    /**
     * Method sets attribute {@link #user}.<br/>
     *
     * @param pUser Value to which {@link #user} should be set.
     * @return {@link Builder} Instance of this builder to support chaining setters. Method never returns null.
     */
    public Builder setUser( String pUser ) {
      // Assign value to attribute
      user = pUser;
      return this;
    }

    /**
     * Method sets attribute {@link #password}.<br/>
     *
     * @param pPassword Value to which {@link #password} should be set.
     * @return {@link Builder} Instance of this builder to support chaining setters. Method never returns null.
     */
    public Builder setPassword( String pPassword ) {
      // Assign value to attribute
      password = pPassword;
      return this;
    }

    /**
     * Method sets attribute {@link #connectTimeout}.<br/>
     *
     * @param pConnectTimeout Value to which {@link #connectTimeout} should be set.
     * @return {@link Builder} Instance of this builder to support chaining setters. Method never returns null.
     */
    public Builder setConnectTimeout( Integer pConnectTimeout ) {
      // Assign value to attribute
      connectTimeout = pConnectTimeout;
      return this;
    }

    /**
     * Method sets attribute {@link #readTimeout}.<br/>
     *
     * @param pReadTimeout Value to which {@link #readTimeout} should be set.
     * @return {@link Builder} Instance of this builder to support chaining setters. Method never returns null.
     */
    public Builder setReadTimeout( Integer pReadTimeout ) {
      // Assign value to attribute
      readTimeout = pReadTimeout;
      return this;
    }

    /**
     * Method sets attribute {@link #acceptAllCertificates}.<br/>
     *
     * @param pAcceptAllCertificates Value to which {@link #acceptAllCertificates} should be set.
     * @return {@link Builder} Instance of this builder to support chaining setters. Method never returns null.
     */
    public Builder setAcceptAllCertificates( Boolean pAcceptAllCertificates ) {
      // Assign value to attribute
      acceptAllCertificates = pAcceptAllCertificates;
      return this;
    }

    /**
     * Method sets attribute {@link #providerCertificate}.<br/>
     *
     * @param pProviderCertificate Value to which {@link #providerCertificate} should be set.
     * @return {@link Builder} Instance of this builder to support chaining setters. Method never returns null.
     */
    public Builder setProviderCertificate( String pProviderCertificate ) {
      // Assign value to attribute
      providerCertificate = pProviderCertificate;
      return this;
    }

    /**
     * Method sets attribute {@link #disableValidityCheck}.<br/>
     *
     * @param pDisableValidityCheck Value to which {@link #disableValidityCheck} should be set.
     * @return {@link Builder} Instance of this builder to support chaining setters. Method never returns null.
     */
    public Builder setDisableValidityCheck( boolean pDisableValidityCheck ) {
      // Assign value to attribute
      disableValidityCheck = pDisableValidityCheck;
      return this;
    }

    /**
     * Method sets attribute {@link #clientSecret}.<br/>
     *
     * @param pClientSecret Value to which {@link #clientSecret} should be set.
     * @return {@link Builder} Instance of this builder to support chaining setters. Method never returns null.
     */
    public Builder setClientSecret( String pClientSecret ) {
      // Assign value to attribute
      clientSecret = pClientSecret;
      return this;
    }

    /**
     * Method sets attribute {@link #allowEMailLogin}.<br/>
     *
     * @param pAllowEMailLogin Value to which {@link #allowEMailLogin} should be set.
     * @return {@link Builder} Instance of this builder to support chaining setters. Method never returns null.
     */
    public Builder setAllowEMailLogin( Boolean pAllowEMailLogin ) {
      // Assign value to attribute
      allowEMailLogin = pAllowEMailLogin;
      return this;
    }

    /**
     * Method creates a new instance of class IdentityProviderContext. The object will be initialized with the values of
     * the builder.
     *
     * @return IdentityProviderContext Created object. The method never returns null.
     */
    public IdentityProviderContext build( ) {
      return new IdentityProviderContext(this);
    }

    /**
     * Method creates a new validated instance of class IdentityProviderContext. The object will be initialized with the
     * values of the builder and validated afterwards.
     *
     * @return IdentityProviderContext Created and validated object. The method never returns null.
     * @throws ConstraintViolationException in case that one or more validations for the created object failed.
     */
    public IdentityProviderContext buildValidated( ) throws ConstraintViolationException {
      IdentityProviderContext lObject = this.build();
      ValidationTools.getValidationTools().enforceObjectValidation(lObject);
      return lObject;
    }
  }

  /**
   * Method returns attribute {@link #providerURL}.<br/>
   * URL of the server of the identity provider e.g. &quot;ldaps://cloud.weeasy.de&quot;
   *
   * @return {@link String} Value to which {@link #providerURL} is set.
   */
  public String getProviderURL( ) {
    return providerURL;
  }

  /**
   * Method sets attribute {@link #providerURL}.<br/>
   * URL of the server of the identity provider e.g. &quot;ldaps://cloud.weeasy.de&quot;
   *
   * @param pProviderURL Value to which {@link #providerURL} should be set.
   */
  public void setProviderURL( String pProviderURL ) {
    // Assign value to attribute
    providerURL = pProviderURL;
  }

  /**
   * Method returns attribute {@link #searchBase}.<br/>
   * Optional attribute defines the search base for accessing identities. This attribute is required in case od ldap
   * based identity providers.
   *
   * @return {@link String} Value to which {@link #searchBase} is set.
   */
  public String getSearchBase( ) {
    return searchBase;
  }

  /**
   * Method sets attribute {@link #searchBase}.<br/>
   * Optional attribute defines the search base for accessing identities. This attribute is required in case od ldap
   * based identity providers.
   *
   * @param pSearchBase Value to which {@link #searchBase} should be set.
   */
  public void setSearchBase( String pSearchBase ) {
    // Assign value to attribute
    searchBase = pSearchBase;
  }

  /**
   * Method returns attribute {@link #domain}.<br/>
   * Domain to which the identity provider server belongs to.
   *
   * @return {@link String} Value to which {@link #domain} is set.
   */
  public String getDomain( ) {
    return domain;
  }

  /**
   * Method sets attribute {@link #domain}.<br/>
   * Domain to which the identity provider server belongs to.
   *
   * @param pDomain Value to which {@link #domain} should be set.
   */
  public void setDomain( String pDomain ) {
    // Assign value to attribute
    domain = pDomain;
  }

  /**
   * Method returns attribute {@link #user}.<br/>
   * Technical user that should be used to access the identity provider. The attribute may be null.
   *
   * @return {@link String} Value to which {@link #user} is set.
   */
  public String getUser( ) {
    return user;
  }

  /**
   * Method sets attribute {@link #user}.<br/>
   * Technical user that should be used to access the identity provider. The attribute may be null.
   *
   * @param pUser Value to which {@link #user} should be set.
   */
  public void setUser( String pUser ) {
    // Assign value to attribute
    user = pUser;
  }

  /**
   * Method returns attribute {@link #password}.<br/>
   * Password of the technical user that should be used to access the identity provider. The attribute may be null.
   *
   * @return {@link String} Value to which {@link #password} is set.
   */
  public String getPassword( ) {
    return password;
  }

  /**
   * Method sets attribute {@link #password}.<br/>
   * Password of the technical user that should be used to access the identity provider. The attribute may be null.
   *
   * @param pPassword Value to which {@link #password} should be set.
   */
  public void setPassword( String pPassword ) {
    // Assign value to attribute
    password = pPassword;
  }

  /**
   * Method returns attribute {@link #connectTimeout}.<br/>
   * Connection timeout when trying to access the identity provider. The attribute may be null.
   *
   * @return {@link Integer} Value to which {@link #connectTimeout} is set.
   */
  public Integer getConnectTimeout( ) {
    return connectTimeout;
  }

  /**
   * Method sets attribute {@link #connectTimeout}.<br/>
   * Connection timeout when trying to access the identity provider. The attribute may be null.
   *
   * @param pConnectTimeout Value to which {@link #connectTimeout} should be set.
   */
  public void setConnectTimeout( Integer pConnectTimeout ) {
    // Assign value to attribute
    connectTimeout = pConnectTimeout;
  }

  /**
   * Method returns attribute {@link #readTimeout}.<br/>
   * Read timeout for queries using the identity provider. The attribute may be null.
   *
   * @return {@link Integer} Value to which {@link #readTimeout} is set.
   */
  public Integer getReadTimeout( ) {
    return readTimeout;
  }

  /**
   * Method sets attribute {@link #readTimeout}.<br/>
   * Read timeout for queries using the identity provider. The attribute may be null.
   *
   * @param pReadTimeout Value to which {@link #readTimeout} should be set.
   */
  public void setReadTimeout( Integer pReadTimeout ) {
    // Assign value to attribute
    readTimeout = pReadTimeout;
  }

  /**
   * Method returns attribute {@link #acceptAllCertificates}.<br/>
   * If attribute is set to true then all SSL certificates are accepted not matter if they are valid or not. This
   * feature is intended to be used in non production environments.
   *
   * @return {@link Boolean} Value to which {@link #acceptAllCertificates} is set.
   */
  public Boolean getAcceptAllCertificates( ) {
    return acceptAllCertificates;
  }

  /**
   * Method sets attribute {@link #acceptAllCertificates}.<br/>
   * If attribute is set to true then all SSL certificates are accepted not matter if they are valid or not. This
   * feature is intended to be used in non production environments.
   *
   * @param pAcceptAllCertificates Value to which {@link #acceptAllCertificates} should be set.
   */
  public void setAcceptAllCertificates( Boolean pAcceptAllCertificates ) {
    // Assign value to attribute
    acceptAllCertificates = pAcceptAllCertificates;
  }

  /**
   * Method returns attribute {@link #providerCertificate}.<br/>
   * Certificate of the identity provider.
   *
   * @return {@link String} Value to which {@link #providerCertificate} is set.
   */
  public String getProviderCertificate( ) {
    return providerCertificate;
  }

  /**
   * Method sets attribute {@link #providerCertificate}.<br/>
   * Certificate of the identity provider.
   *
   * @param pProviderCertificate Value to which {@link #providerCertificate} should be set.
   */
  public void setProviderCertificate( String pProviderCertificate ) {
    // Assign value to attribute
    providerCertificate = pProviderCertificate;
  }

  /**
   * Method returns attribute {@link #disableValidityCheck}.<br/>
   * Attributes defines whether a may be exiting validity check should be disabled. This feature is intended only to be
   * used for testing but never in production environments.
   *
   * @return boolean Value to which {@link #disableValidityCheck} is set.
   */
  @Deprecated
  public boolean getDisableValidityCheck( ) {
    return disableValidityCheck;
  }

  /**
   * Method returns attribute {@link #disableValidityCheck}.<br/>
   * Attributes defines whether a may be exiting validity check should be disabled. This feature is intended only to be
   * used for testing but never in production environments.
   *
   * @return boolean Value to which {@link #disableValidityCheck} is set.
   */
  public boolean isDisableValidityCheck( ) {
    return disableValidityCheck;
  }

  /**
   * Method sets attribute {@link #disableValidityCheck}.<br/>
   * Attributes defines whether a may be exiting validity check should be disabled. This feature is intended only to be
   * used for testing but never in production environments.
   *
   * @param pDisableValidityCheck Value to which {@link #disableValidityCheck} should be set.
   */
  public void setDisableValidityCheck( boolean pDisableValidityCheck ) {
    // Assign value to attribute
    disableValidityCheck = pDisableValidityCheck;
  }

  /**
   * Method returns attribute {@link #clientSecret}.<br/>
   * Client secret is used in case of OAuth.
   *
   * @return {@link String} Value to which {@link #clientSecret} is set.
   */
  public String getClientSecret( ) {
    return clientSecret;
  }

  /**
   * Method sets attribute {@link #clientSecret}.<br/>
   * Client secret is used in case of OAuth.
   *
   * @param pClientSecret Value to which {@link #clientSecret} should be set.
   */
  public void setClientSecret( String pClientSecret ) {
    // Assign value to attribute
    clientSecret = pClientSecret;
  }

  /**
   * Method returns attribute {@link #allowEMailLogin}.<br/>
   * true if login with the email address is allowed, otherwise false.
   *
   * @return {@link Boolean} Value to which {@link #allowEMailLogin} is set.
   */
  public Boolean getAllowEMailLogin( ) {
    return allowEMailLogin;
  }

  /**
   * Method sets attribute {@link #allowEMailLogin}.<br/>
   * true if login with the email address is allowed, otherwise false.
   *
   * @param pAllowEMailLogin Value to which {@link #allowEMailLogin} should be set.
   */
  public void setAllowEMailLogin( Boolean pAllowEMailLogin ) {
    // Assign value to attribute
    allowEMailLogin = pAllowEMailLogin;
  }

  /**
   * Method returns a StringBuilder that can be used to create a String representation of this object. The returned
   * StringBuilder also takes care about attributes of super classes.
   *
   * @return {@link StringBuilder} StringBuilder representing this object. The method never returns null.
   */
  public StringBuilder toStringBuilder( String pIndent ) {
    StringBuilder lBuilder = new StringBuilder();
    lBuilder.append(pIndent);
    lBuilder.append(this.getClass().getName());
    lBuilder.append(System.lineSeparator());
    lBuilder.append(pIndent);
    lBuilder.append("providerURL: ");
    lBuilder.append(providerURL);
    lBuilder.append(System.lineSeparator());
    lBuilder.append(pIndent);
    lBuilder.append("searchBase: ");
    lBuilder.append(searchBase);
    lBuilder.append(System.lineSeparator());
    lBuilder.append(pIndent);
    lBuilder.append("domain: ");
    lBuilder.append(domain);
    lBuilder.append(System.lineSeparator());
    lBuilder.append(pIndent);
    lBuilder.append("user: ");
    lBuilder.append(user);
    lBuilder.append(System.lineSeparator());
    lBuilder.append(pIndent);
    lBuilder.append("password: ");
    lBuilder.append(password);
    lBuilder.append(System.lineSeparator());
    lBuilder.append(pIndent);
    lBuilder.append("connectTimeout: ");
    lBuilder.append(connectTimeout);
    lBuilder.append(System.lineSeparator());
    lBuilder.append(pIndent);
    lBuilder.append("readTimeout: ");
    lBuilder.append(readTimeout);
    lBuilder.append(System.lineSeparator());
    lBuilder.append(pIndent);
    lBuilder.append("acceptAllCertificates: ");
    lBuilder.append(acceptAllCertificates);
    lBuilder.append(System.lineSeparator());
    lBuilder.append(pIndent);
    lBuilder.append("providerCertificate: ");
    lBuilder.append(providerCertificate);
    lBuilder.append(System.lineSeparator());
    lBuilder.append(pIndent);
    lBuilder.append("disableValidityCheck: ");
    lBuilder.append(disableValidityCheck);
    lBuilder.append(System.lineSeparator());
    lBuilder.append(pIndent);
    lBuilder.append("clientSecret: ");
    lBuilder.append(clientSecret);
    lBuilder.append(System.lineSeparator());
    lBuilder.append(pIndent);
    lBuilder.append("allowEMailLogin: ");
    lBuilder.append(allowEMailLogin);
    lBuilder.append(System.lineSeparator());
    return lBuilder;
  }

  /**
   * Method creates a new String with the values of all attributes of this class. All references to other objects will
   * be ignored.
   *
   * @return {@link String} String representation of this object. The method never returns null.
   */
  @Override
  public String toString( ) {
    return this.toStringBuilder("").toString();
  }

  /**
   * Method creates a new builder and initializes it with the data of this object.
   *
   * @return {@link Builder} New builder that can be used to create new IdentityProviderContext objects. The method
   * never returns null.
   */
  public Builder toBuilder( ) {
    return new Builder(this);
  }
}