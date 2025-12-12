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
 * Class defines the possible query criteria when searching for users.
 *
 * @author JEAF Generator
 * @version JEAF Release 1.4.x
 */
public class IdentityQuery implements ServiceObject {
  /**
   * Default serial version uid.
   */
  private static final long serialVersionUID = 1L;

  /**
   * Constant for the name of attribute "queryString".
   */
  public static final String QUERYSTRING = "queryString";

  /**
   * Constant for the name of attribute "active".
   */
  public static final String ACTIVE = "active";

  /**
   * Constant for the name of attribute "userRole".
   */
  public static final String USERROLE = "userRole";

  private String queryString;

  /**
   * If flag is set to true, then only active identities will be searched.
   */
  private Boolean active;

  /**
   * Attribute to filter for users with a specific role.
   */
  private String userRole;

  /**
   * Default constructor is only intended to be used for deserialization by tools like Jackson for JSON. For "normal"
   * object creation builder should be used instead.
   */
  protected IdentityQuery( ) {
  }

  /**
   * Initialize object using the passed builder.
   *
   * @param pBuilder Builder that should be used to initialize this object. The parameter must not be null.
   */
  protected IdentityQuery( Builder pBuilder ) {
    // Ensure that builder is not null.
    Check.checkInvalidParameterNull(pBuilder, "pBuilder");
    // Read attribute values from builder.
    queryString = pBuilder.queryString;
    active = pBuilder.active;
    userRole = pBuilder.userRole;
  }

  /**
   * Method returns a new builder.
   *
   * @return {@link Builder} New builder that can be used to create new IdentityQuery objects.
   */
  public static Builder builder( ) {
    return new Builder();
  }

  /**
   * Class implements builder to create a new instance of class <code>IdentityQuery</code>.
   */
  public static class Builder {
    private String queryString;

    /**
     * If flag is set to true, then only active identities will be searched.
     */
    private Boolean active;

    /**
     * Attribute to filter for users with a specific role.
     */
    private String userRole;

    /**
     * Use {@link IdentityQuery#builder()} instead of private constructor to create new builder.
     */
    protected Builder( ) {
    }

    /**
     * Use {@link IdentityQuery#builder(IdentityQuery)} instead of private constructor to create new builder.
     */
    protected Builder( IdentityQuery pObject ) {
      if (pObject != null) {
        // Read attribute values from passed object.
        this.setQueryString(pObject.queryString);
        this.setActive(pObject.active);
        this.setUserRole(pObject.userRole);
      }
    }

    /**
     * Method sets attribute {@link #queryString}.<br/>
     *
     * @param pQueryString Value to which {@link #queryString} should be set.
     * @return {@link Builder} Instance of this builder to support chaining setters. Method never returns null.
     */
    public Builder setQueryString( String pQueryString ) {
      // Assign value to attribute
      queryString = pQueryString;
      return this;
    }

    /**
     * Method sets attribute {@link #active}.<br/>
     *
     * @param pActive Value to which {@link #active} should be set.
     * @return {@link Builder} Instance of this builder to support chaining setters. Method never returns null.
     */
    public Builder setActive( Boolean pActive ) {
      // Assign value to attribute
      active = pActive;
      return this;
    }

    /**
     * Method sets attribute {@link #userRole}.<br/>
     *
     * @param pUserRole Value to which {@link #userRole} should be set.
     * @return {@link Builder} Instance of this builder to support chaining setters. Method never returns null.
     */
    public Builder setUserRole( String pUserRole ) {
      // Assign value to attribute
      userRole = pUserRole;
      return this;
    }

    /**
     * Method creates a new instance of class IdentityQuery. The object will be initialized with the values of the
     * builder.
     *
     * @return IdentityQuery Created object. The method never returns null.
     */
    public IdentityQuery build( ) {
      return new IdentityQuery(this);
    }

    /**
     * Method creates a new validated instance of class IdentityQuery. The object will be initialized with the values of
     * the builder and validated afterwards.
     *
     * @return IdentityQuery Created and validated object. The method never returns null.
     * @throws ConstraintViolationException in case that one or more validations for the created object failed.
     */
    public IdentityQuery buildValidated( ) throws ConstraintViolationException {
      IdentityQuery lObject = this.build();
      ValidationTools.getValidationTools().enforceObjectValidation(lObject);
      return lObject;
    }
  }

  /**
   * Method returns attribute {@link #queryString}.<br/>
   *
   * @return {@link String} Value to which {@link #queryString} is set.
   */
  public String getQueryString( ) {
    return queryString;
  }

  /**
   * Method sets attribute {@link #queryString}.<br/>
   *
   * @param pQueryString Value to which {@link #queryString} should be set.
   */
  public void setQueryString( String pQueryString ) {
    // Assign value to attribute
    queryString = pQueryString;
  }

  /**
   * Method returns attribute {@link #active}.<br/>
   * If flag is set to true, then only active identities will be searched.
   *
   * @return {@link Boolean} Value to which {@link #active} is set.
   */
  public Boolean getActive( ) {
    return active;
  }

  /**
   * Method sets attribute {@link #active}.<br/>
   * If flag is set to true, then only active identities will be searched.
   *
   * @param pActive Value to which {@link #active} should be set.
   */
  public void setActive( Boolean pActive ) {
    // Assign value to attribute
    active = pActive;
  }

  /**
   * Method returns attribute {@link #userRole}.<br/>
   * Attribute to filter for users with a specific role.
   *
   * @return {@link String} Value to which {@link #userRole} is set.
   */
  public String getUserRole( ) {
    return userRole;
  }

  /**
   * Method sets attribute {@link #userRole}.<br/>
   * Attribute to filter for users with a specific role.
   *
   * @param pUserRole Value to which {@link #userRole} should be set.
   */
  public void setUserRole( String pUserRole ) {
    // Assign value to attribute
    userRole = pUserRole;
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
    lBuilder.append("queryString: ");
    lBuilder.append(queryString);
    lBuilder.append(System.lineSeparator());
    lBuilder.append(pIndent);
    lBuilder.append("active: ");
    lBuilder.append(active);
    lBuilder.append(System.lineSeparator());
    lBuilder.append(pIndent);
    lBuilder.append("userRole: ");
    lBuilder.append(userRole);
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
   * @return {@link Builder} New builder that can be used to create new IdentityQuery objects. The method never returns
   * null.
   */
  public Builder toBuilder( ) {
    return new Builder(this);
  }
}