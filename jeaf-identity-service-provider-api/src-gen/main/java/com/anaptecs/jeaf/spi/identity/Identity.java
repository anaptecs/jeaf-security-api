/*
 * anaptecs GmbH, Ricarda-Huch-Str. 71, 72760 Reutlingen, Germany
 *
 * Copyright 2004 - 2020. All rights reserved.
 */
package com.anaptecs.jeaf.spi.identity;

import java.util.Date;

import javax.validation.ConstraintViolationException;

import com.anaptecs.jeaf.core.api.ServiceObject;
import com.anaptecs.jeaf.core.api.ServiceObjectID;
import com.anaptecs.jeaf.tools.api.validation.ValidationTools;
import com.anaptecs.jeaf.xfun.api.checks.Check;
import com.anaptecs.jeaf.xfun.api.common.Identifiable;
import com.anaptecs.jeaf.xfun.api.common.ObjectIdentity;

/**
 * Class represents an identity (user).
 *
 * @author JEAF Generator
 * @version JEAF Release 1.4.x
 */
public class Identity implements ServiceObject, Identifiable<ServiceObjectID> {
  /**
   * Default serial version uid.
   */
  private static final long serialVersionUID = 1L;

  /**
   * Constant for the name of attribute "loginName".
   */
  public static final String LOGINNAME = "loginName";

  /**
   * Constant for the name of attribute "name".
   */
  public static final String NAME = "name";

  /**
   * Constant for the name of attribute "oAuthToken".
   */
  public static final String OAUTHTOKEN = "oAuthToken";

  /**
   * Constant for the name of attribute "firstName".
   */
  public static final String FIRSTNAME = "firstName";

  /**
   * Constant for the name of attribute "email".
   */
  public static final String EMAIL = "email";

  /**
   * Constant for the name of attribute "dateOfBirth".
   */
  public static final String DATEOFBIRTH = "dateOfBirth";

  /**
   * Constant for the name of attribute "street".
   */
  public static final String STREET = "street";

  /**
   * Constant for the name of attribute "postalCode".
   */
  public static final String POSTALCODE = "postalCode";

  /**
   * Constant for the name of attribute "city".
   */
  public static final String CITY = "city";

  /**
   * Constant for the name of attribute "country".
   */
  public static final String COUNTRY = "country";

  /**
   * Constant for the name of attribute "state".
   */
  public static final String STATE = "state";

  /**
   * Reference to the identifier of this object. The reference may be null since an id is not mandatory.
   */
  private final ServiceObjectID objectID;

  /**
   * Login name of the user. The attribute is never null.
   */
  private String loginName;

  /**
   * Name of the user. The attribute is never null.
   */
  private String name;

  /**
   * OAuth token that was created during the login of an identity. The attribute is only set in case that OAuth is used
   * as authentication protocol.
   */
  private String oAuthToken;

  /**
   * First name of the user. The attribute may be null.
   */
  private String firstName;

  /**
   * E-Mail of the user. The attribute may be null.
   */
  private String email;

  /**
   * Date of birth of the identity.
   */
  private Date dateOfBirth;

  /**
   * Street of the user. The attribute may be null.
   */
  private String street;

  /**
   * Postal code of the user. The attribute may be null.
   */
  private Integer postalCode;

  /**
   * City of the user. The attribute may be null.
   */
  private String city;

  /**
   * Country of the user. The attribute may be null.
   */
  private String country;

  /**
   * State of the identity.
   */
  private IdentityState state;

  /**
   * Default constructor is only intended to be used for deserialization by tools like Jackson for JSON. For "normal"
   * object creation builder should be used instead.
   */
  protected Identity( ) {
    objectID = null;
  }

  /**
   * Initialize object using the passed builder.
   *
   * @param pBuilder Builder that should be used to initialize this object. The parameter must not be null.
   */
  protected Identity( Builder pBuilder ) {
    // Ensure that builder is not null.
    Check.checkInvalidParameterNull(pBuilder, "pBuilder");
    // Read object ID.
    ObjectIdentity<?> lObjectID = pBuilder.objectID;
    if (lObjectID != null) {
      objectID = new ServiceObjectID(pBuilder.objectID);
    }
    else {
      objectID = null;
    }
    // Read attribute values from builder.
    loginName = pBuilder.loginName;
    name = pBuilder.name;
    oAuthToken = pBuilder.oAuthToken;
    firstName = pBuilder.firstName;
    email = pBuilder.email;
    dateOfBirth = pBuilder.dateOfBirth;
    street = pBuilder.street;
    postalCode = pBuilder.postalCode;
    city = pBuilder.city;
    country = pBuilder.country;
    state = pBuilder.state;
  }

  /**
   * Method returns a new builder.
   *
   * @return {@link Builder} New builder that can be used to create new Identity objects.
   */
  public static Builder builder( ) {
    return new Builder();
  }

  /**
   * Class implements builder to create a new instance of class <code>Identity</code>.
   */
  public static class Builder {
    /**
     * Reference to the identifier of this object. The reference may be null since an id is not mandatory.
     */
    private ObjectIdentity<?> objectID;

    /**
     * Login name of the user. The attribute is never null.
     */
    private String loginName;

    /**
     * Name of the user. The attribute is never null.
     */
    private String name;

    /**
     * OAuth token that was created during the login of an identity. The attribute is only set in case that OAuth is
     * used as authentication protocol.
     */
    private String oAuthToken;

    /**
     * First name of the user. The attribute may be null.
     */
    private String firstName;

    /**
     * E-Mail of the user. The attribute may be null.
     */
    private String email;

    /**
     * Date of birth of the identity.
     */
    private Date dateOfBirth;

    /**
     * Street of the user. The attribute may be null.
     */
    private String street;

    /**
     * Postal code of the user. The attribute may be null.
     */
    private Integer postalCode;

    /**
     * City of the user. The attribute may be null.
     */
    private String city;

    /**
     * Country of the user. The attribute may be null.
     */
    private String country;

    /**
     * State of the identity.
     */
    private IdentityState state;

    /**
     * Use {@link Identity#builder()} instead of private constructor to create new builder.
     */
    protected Builder( ) {
    }

    /**
     * Use {@link Identity#builder(Identity)} instead of private constructor to create new builder.
     */
    protected Builder( Identity pObject ) {
      if (pObject != null) {
        // Read attribute values from passed object.
        objectID = pObject.objectID;
        this.setLoginName(pObject.loginName);
        this.setName(pObject.name);
        this.setOAuthToken(pObject.oAuthToken);
        this.setFirstName(pObject.firstName);
        this.setEmail(pObject.email);
        this.setDateOfBirth(pObject.dateOfBirth);
        this.setStreet(pObject.street);
        this.setPostalCode(pObject.postalCode);
        this.setCity(pObject.city);
        this.setCountry(pObject.country);
        this.setState(pObject.state);
      }
    }

    /**
     * Method sets the identifier for the object created using the builder. The reference may be null since an id is not
     * mandatory.
     */
    public Builder setID( ObjectIdentity<?> pObjectID ) {
      objectID = pObjectID;
      return this;
    }

    /**
     * Method sets attribute {@link #loginName}.<br/>
     *
     * @param pLoginName Value to which {@link #loginName} should be set.
     * @return {@link Builder} Instance of this builder to support chaining setters. Method never returns null.
     */
    public Builder setLoginName( String pLoginName ) {
      // Assign value to attribute
      loginName = pLoginName;
      return this;
    }

    /**
     * Method sets attribute {@link #name}.<br/>
     *
     * @param pName Value to which {@link #name} should be set.
     * @return {@link Builder} Instance of this builder to support chaining setters. Method never returns null.
     */
    public Builder setName( String pName ) {
      // Assign value to attribute
      name = pName;
      return this;
    }

    /**
     * Method sets attribute {@link #oAuthToken}.<br/>
     *
     * @param pOAuthToken Value to which {@link #oAuthToken} should be set.
     * @return {@link Builder} Instance of this builder to support chaining setters. Method never returns null.
     */
    public Builder setOAuthToken( String pOAuthToken ) {
      // Assign value to attribute
      oAuthToken = pOAuthToken;
      return this;
    }

    /**
     * Method sets attribute {@link #firstName}.<br/>
     *
     * @param pFirstName Value to which {@link #firstName} should be set.
     * @return {@link Builder} Instance of this builder to support chaining setters. Method never returns null.
     */
    public Builder setFirstName( String pFirstName ) {
      // Assign value to attribute
      firstName = pFirstName;
      return this;
    }

    /**
     * Method sets attribute {@link #email}.<br/>
     *
     * @param pEmail Value to which {@link #email} should be set.
     * @return {@link Builder} Instance of this builder to support chaining setters. Method never returns null.
     */
    public Builder setEmail( String pEmail ) {
      // Assign value to attribute
      email = pEmail;
      return this;
    }

    /**
     * Method sets attribute {@link #dateOfBirth}.<br/>
     *
     * @param pDateOfBirth Value to which {@link #dateOfBirth} should be set.
     * @return {@link Builder} Instance of this builder to support chaining setters. Method never returns null.
     */
    public Builder setDateOfBirth( Date pDateOfBirth ) {
      // Assign value to attribute
      dateOfBirth = pDateOfBirth;
      return this;
    }

    /**
     * Method sets attribute {@link #street}.<br/>
     *
     * @param pStreet Value to which {@link #street} should be set.
     * @return {@link Builder} Instance of this builder to support chaining setters. Method never returns null.
     */
    public Builder setStreet( String pStreet ) {
      // Assign value to attribute
      street = pStreet;
      return this;
    }

    /**
     * Method sets attribute {@link #postalCode}.<br/>
     *
     * @param pPostalCode Value to which {@link #postalCode} should be set.
     * @return {@link Builder} Instance of this builder to support chaining setters. Method never returns null.
     */
    public Builder setPostalCode( Integer pPostalCode ) {
      // Assign value to attribute
      postalCode = pPostalCode;
      return this;
    }

    /**
     * Method sets attribute {@link #city}.<br/>
     *
     * @param pCity Value to which {@link #city} should be set.
     * @return {@link Builder} Instance of this builder to support chaining setters. Method never returns null.
     */
    public Builder setCity( String pCity ) {
      // Assign value to attribute
      city = pCity;
      return this;
    }

    /**
     * Method sets attribute {@link #country}.<br/>
     *
     * @param pCountry Value to which {@link #country} should be set.
     * @return {@link Builder} Instance of this builder to support chaining setters. Method never returns null.
     */
    public Builder setCountry( String pCountry ) {
      // Assign value to attribute
      country = pCountry;
      return this;
    }

    /**
     * Method sets attribute {@link #state}.<br/>
     *
     * @param pState Value to which {@link #state} should be set.
     * @return {@link Builder} Instance of this builder to support chaining setters. Method never returns null.
     */
    public Builder setState( IdentityState pState ) {
      // Assign value to attribute
      state = pState;
      return this;
    }

    /**
     * Method creates a new instance of class Identity. The object will be initialized with the values of the builder.
     *
     * @return Identity Created object. The method never returns null.
     */
    public Identity build( ) {
      return new Identity(this);
    }

    /**
     * Method creates a new validated instance of class Identity. The object will be initialized with the values of the
     * builder and validated afterwards.
     *
     * @return Identity Created and validated object. The method never returns null.
     * @throws ConstraintViolationException in case that one or more validations for the created object failed.
     */
    public Identity buildValidated( ) throws ConstraintViolationException {
      Identity lObject = this.build();
      ValidationTools.getValidationTools().enforceObjectValidation(lObject);
      return lObject;
    }
  }

  /**
   * Method returns the id of this object.
   *
   * @return {@link ServiceObjectID} ID of this object. Since an object must not have an id the method may also return
   * null.
   */
  @Override
  public final ServiceObjectID getID( ) {
    return objectID;
  }

  /**
   * Method returns the unversioned object id of this object.
   *
   * @return {@link ServiceObjectID} ID of this object. Since an object must not have an id the method may also return
   * null.
   */
  @Override
  public final ServiceObjectID getUnversionedID( ) {
    ServiceObjectID lUnversionedID;
    if (objectID != null) {
      lUnversionedID = objectID.getUnversionedObjectID();
    }
    else {
      lUnversionedID = null;
    }
    return lUnversionedID;
  }

  /**
   * Method returns attribute {@link #loginName}.<br/>
   * Login name of the user. The attribute is never null.
   *
   * @return {@link String} Value to which {@link #loginName} is set.
   */
  public String getLoginName( ) {
    return loginName;
  }

  /**
   * Method sets attribute {@link #loginName}.<br/>
   * Login name of the user. The attribute is never null.
   *
   * @param pLoginName Value to which {@link #loginName} should be set.
   */
  public void setLoginName( String pLoginName ) {
    // Assign value to attribute
    loginName = pLoginName;
  }

  /**
   * Method returns attribute {@link #name}.<br/>
   * Name of the user. The attribute is never null.
   *
   * @return {@link String} Value to which {@link #name} is set.
   */
  public String getName( ) {
    return name;
  }

  /**
   * Method sets attribute {@link #name}.<br/>
   * Name of the user. The attribute is never null.
   *
   * @param pName Value to which {@link #name} should be set.
   */
  public void setName( String pName ) {
    // Assign value to attribute
    name = pName;
  }

  /**
   * Method returns attribute {@link #oAuthToken}.<br/>
   * OAuth token that was created during the login of an identity. The attribute is only set in case that OAuth is used
   * as authentication protocol.
   *
   * @return {@link String} Value to which {@link #oAuthToken} is set.
   */
  public String getOAuthToken( ) {
    return oAuthToken;
  }

  /**
   * Method sets attribute {@link #oAuthToken}.<br/>
   * OAuth token that was created during the login of an identity. The attribute is only set in case that OAuth is used
   * as authentication protocol.
   *
   * @param pOAuthToken Value to which {@link #oAuthToken} should be set.
   */
  public void setOAuthToken( String pOAuthToken ) {
    // Assign value to attribute
    oAuthToken = pOAuthToken;
  }

  /**
   * Method returns attribute {@link #firstName}.<br/>
   * First name of the user. The attribute may be null.
   *
   * @return {@link String} Value to which {@link #firstName} is set.
   */
  public String getFirstName( ) {
    return firstName;
  }

  /**
   * Method sets attribute {@link #firstName}.<br/>
   * First name of the user. The attribute may be null.
   *
   * @param pFirstName Value to which {@link #firstName} should be set.
   */
  public void setFirstName( String pFirstName ) {
    // Assign value to attribute
    firstName = pFirstName;
  }

  /**
   * Method returns attribute {@link #email}.<br/>
   * E-Mail of the user. The attribute may be null.
   *
   * @return {@link String} Value to which {@link #email} is set.
   */
  public String getEmail( ) {
    return email;
  }

  /**
   * Method sets attribute {@link #email}.<br/>
   * E-Mail of the user. The attribute may be null.
   *
   * @param pEmail Value to which {@link #email} should be set.
   */
  public void setEmail( String pEmail ) {
    // Assign value to attribute
    email = pEmail;
  }

  /**
   * Method returns attribute {@link #dateOfBirth}.<br/>
   * Date of birth of the identity.
   *
   * @return {@link Date} Value to which {@link #dateOfBirth} is set.
   */
  public Date getDateOfBirth( ) {
    return dateOfBirth;
  }

  /**
   * Method sets attribute {@link #dateOfBirth}.<br/>
   * Date of birth of the identity.
   *
   * @param pDateOfBirth Value to which {@link #dateOfBirth} should be set.
   */
  public void setDateOfBirth( Date pDateOfBirth ) {
    // Assign value to attribute
    dateOfBirth = pDateOfBirth;
  }

  /**
   * Method returns attribute {@link #street}.<br/>
   * Street of the user. The attribute may be null.
   *
   * @return {@link String} Value to which {@link #street} is set.
   */
  public String getStreet( ) {
    return street;
  }

  /**
   * Method sets attribute {@link #street}.<br/>
   * Street of the user. The attribute may be null.
   *
   * @param pStreet Value to which {@link #street} should be set.
   */
  public void setStreet( String pStreet ) {
    // Assign value to attribute
    street = pStreet;
  }

  /**
   * Method returns attribute {@link #postalCode}.<br/>
   * Postal code of the user. The attribute may be null.
   *
   * @return {@link Integer} Value to which {@link #postalCode} is set.
   */
  public Integer getPostalCode( ) {
    return postalCode;
  }

  /**
   * Method sets attribute {@link #postalCode}.<br/>
   * Postal code of the user. The attribute may be null.
   *
   * @param pPostalCode Value to which {@link #postalCode} should be set.
   */
  public void setPostalCode( Integer pPostalCode ) {
    // Assign value to attribute
    postalCode = pPostalCode;
  }

  /**
   * Method returns attribute {@link #city}.<br/>
   * City of the user. The attribute may be null.
   *
   * @return {@link String} Value to which {@link #city} is set.
   */
  public String getCity( ) {
    return city;
  }

  /**
   * Method sets attribute {@link #city}.<br/>
   * City of the user. The attribute may be null.
   *
   * @param pCity Value to which {@link #city} should be set.
   */
  public void setCity( String pCity ) {
    // Assign value to attribute
    city = pCity;
  }

  /**
   * Method returns attribute {@link #country}.<br/>
   * Country of the user. The attribute may be null.
   *
   * @return {@link String} Value to which {@link #country} is set.
   */
  public String getCountry( ) {
    return country;
  }

  /**
   * Method sets attribute {@link #country}.<br/>
   * Country of the user. The attribute may be null.
   *
   * @param pCountry Value to which {@link #country} should be set.
   */
  public void setCountry( String pCountry ) {
    // Assign value to attribute
    country = pCountry;
  }

  /**
   * Method returns attribute {@link #state}.<br/>
   * State of the identity.
   *
   * @return {@link IdentityState} Value to which {@link #state} is set.
   */
  public IdentityState getState( ) {
    return state;
  }

  /**
   * Method sets attribute {@link #state}.<br/>
   * State of the identity.
   *
   * @param pState Value to which {@link #state} should be set.
   */
  public void setState( IdentityState pState ) {
    // Assign value to attribute
    state = pState;
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
    lBuilder.append("loginName: ");
    lBuilder.append(loginName);
    lBuilder.append(System.lineSeparator());
    lBuilder.append(pIndent);
    lBuilder.append("name: ");
    lBuilder.append(name);
    lBuilder.append(System.lineSeparator());
    lBuilder.append(pIndent);
    lBuilder.append("oAuthToken: ");
    lBuilder.append(oAuthToken);
    lBuilder.append(System.lineSeparator());
    lBuilder.append(pIndent);
    lBuilder.append("firstName: ");
    lBuilder.append(firstName);
    lBuilder.append(System.lineSeparator());
    lBuilder.append(pIndent);
    lBuilder.append("email: ");
    lBuilder.append(email);
    lBuilder.append(System.lineSeparator());
    lBuilder.append(pIndent);
    lBuilder.append("dateOfBirth: ");
    lBuilder.append(dateOfBirth);
    lBuilder.append(System.lineSeparator());
    lBuilder.append(pIndent);
    lBuilder.append("street: ");
    lBuilder.append(street);
    lBuilder.append(System.lineSeparator());
    lBuilder.append(pIndent);
    lBuilder.append("postalCode: ");
    lBuilder.append(postalCode);
    lBuilder.append(System.lineSeparator());
    lBuilder.append(pIndent);
    lBuilder.append("city: ");
    lBuilder.append(city);
    lBuilder.append(System.lineSeparator());
    lBuilder.append(pIndent);
    lBuilder.append("country: ");
    lBuilder.append(country);
    lBuilder.append(System.lineSeparator());
    lBuilder.append(pIndent);
    lBuilder.append("state: ");
    lBuilder.append(state);
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
   * @return {@link Builder} New builder that can be used to create new Identity objects. The method never returns null.
   */
  public Builder toBuilder( ) {
    return new Builder(this);
  }
}