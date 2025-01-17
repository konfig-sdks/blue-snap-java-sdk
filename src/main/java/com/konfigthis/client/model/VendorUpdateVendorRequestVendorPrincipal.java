/*
 * API Settings
 * At BlueSnap, we look at payments a little differently. Our Payment Orchestration Platform helps businesses accept payments globally and is designed to increase revenue and reduces costs. We provide a comprehensive back-end solutions that simplifies the complexity of payments, managing the full process from start to finish.  BlueSnap supports payments through multiple sales channels such as online and mobile sales, marketplaces, subscriptions, invoice payments and manual orders through a virtual terminal. And for businesses looking for embedded payments, we offer white-labeled payments for platforms with automated underwriting and onboarding that supports marketplaces and split payments.  And with one integration and contract, businesses can sell in over 200 geographies with access to local acquiring in 47 countries, 110+ currencies and 100+ global payment types, including popular eWallets, automated accounts receivable, world-class fraud protection and chargeback management, built-in solutions for regulation and tax compliance, and unified global reporting to help businesses grow.  With a US headquarters in Waltham, MA, and EU headquarters in Dublin, Ireland, BlueSnap is backed by world-class private equity investors including Great Hill Partners and Parthenon Capital Partners.   Learn more at BlueSnap.com
 *
 * The version of the OpenAPI document: 8976-Tools
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * VendorUpdateVendorRequestVendorPrincipal
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class VendorUpdateVendorRequestVendorPrincipal {
  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName = "Joe";

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName = "Smith";

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address = "123 Main Street";

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city = "Juneau";

  public static final String SERIALIZED_NAME_ZIP = "zip";
  @SerializedName(SERIALIZED_NAME_ZIP)
  private String zip = "02453";

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country = "US";

  public static final String SERIALIZED_NAME_DOB = "dob";
  @SerializedName(SERIALIZED_NAME_DOB)
  private String dob = "28-09-9999";

  public static final String SERIALIZED_NAME_PERSONAL_IDENTIFICATION_NUMBER = "personalIdentificationNumber";
  @SerializedName(SERIALIZED_NAME_PERSONAL_IDENTIFICATION_NUMBER)
  private Integer personalIdentificationNumber = 1234;

  public static final String SERIALIZED_NAME_DRIVER_LICENSE_NUMBER = "driverLicenseNumber";
  @SerializedName(SERIALIZED_NAME_DRIVER_LICENSE_NUMBER)
  private String driverLicenseNumber = "561196411";

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email = "principal.name@vendor.com";

  public VendorUpdateVendorRequestVendorPrincipal() {
  }

  public VendorUpdateVendorRequestVendorPrincipal firstName(String firstName) {
    
    
    
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Joe", value = "")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    
    
    
    this.firstName = firstName;
  }


  public VendorUpdateVendorRequestVendorPrincipal lastName(String lastName) {
    
    
    
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Smith", value = "")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    
    
    
    this.lastName = lastName;
  }


  public VendorUpdateVendorRequestVendorPrincipal address(String address) {
    
    
    
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123 Main Street", value = "")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    
    
    
    this.address = address;
  }


  public VendorUpdateVendorRequestVendorPrincipal city(String city) {
    
    
    
    
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Juneau", value = "")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    
    
    
    this.city = city;
  }


  public VendorUpdateVendorRequestVendorPrincipal zip(String zip) {
    
    
    
    
    this.zip = zip;
    return this;
  }

   /**
   * Get zip
   * @return zip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "02453", value = "")

  public String getZip() {
    return zip;
  }


  public void setZip(String zip) {
    
    
    
    this.zip = zip;
  }


  public VendorUpdateVendorRequestVendorPrincipal country(String country) {
    
    
    
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "US", value = "")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    
    
    
    this.country = country;
  }


  public VendorUpdateVendorRequestVendorPrincipal dob(String dob) {
    
    
    
    
    this.dob = dob;
    return this;
  }

   /**
   * Get dob
   * @return dob
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "28-09-9999", value = "")

  public String getDob() {
    return dob;
  }


  public void setDob(String dob) {
    
    
    
    this.dob = dob;
  }


  public VendorUpdateVendorRequestVendorPrincipal personalIdentificationNumber(Integer personalIdentificationNumber) {
    
    
    
    
    this.personalIdentificationNumber = personalIdentificationNumber;
    return this;
  }

   /**
   * Get personalIdentificationNumber
   * @return personalIdentificationNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234", value = "")

  public Integer getPersonalIdentificationNumber() {
    return personalIdentificationNumber;
  }


  public void setPersonalIdentificationNumber(Integer personalIdentificationNumber) {
    
    
    
    this.personalIdentificationNumber = personalIdentificationNumber;
  }


  public VendorUpdateVendorRequestVendorPrincipal driverLicenseNumber(String driverLicenseNumber) {
    
    
    
    
    this.driverLicenseNumber = driverLicenseNumber;
    return this;
  }

   /**
   * Get driverLicenseNumber
   * @return driverLicenseNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "561196411", value = "")

  public String getDriverLicenseNumber() {
    return driverLicenseNumber;
  }


  public void setDriverLicenseNumber(String driverLicenseNumber) {
    
    
    
    this.driverLicenseNumber = driverLicenseNumber;
  }


  public VendorUpdateVendorRequestVendorPrincipal email(String email) {
    
    
    
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "principal.name@vendor.com", value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    
    
    
    this.email = email;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the VendorUpdateVendorRequestVendorPrincipal instance itself
   */
  public VendorUpdateVendorRequestVendorPrincipal putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorUpdateVendorRequestVendorPrincipal vendorUpdateVendorRequestVendorPrincipal = (VendorUpdateVendorRequestVendorPrincipal) o;
    return Objects.equals(this.firstName, vendorUpdateVendorRequestVendorPrincipal.firstName) &&
        Objects.equals(this.lastName, vendorUpdateVendorRequestVendorPrincipal.lastName) &&
        Objects.equals(this.address, vendorUpdateVendorRequestVendorPrincipal.address) &&
        Objects.equals(this.city, vendorUpdateVendorRequestVendorPrincipal.city) &&
        Objects.equals(this.zip, vendorUpdateVendorRequestVendorPrincipal.zip) &&
        Objects.equals(this.country, vendorUpdateVendorRequestVendorPrincipal.country) &&
        Objects.equals(this.dob, vendorUpdateVendorRequestVendorPrincipal.dob) &&
        Objects.equals(this.personalIdentificationNumber, vendorUpdateVendorRequestVendorPrincipal.personalIdentificationNumber) &&
        Objects.equals(this.driverLicenseNumber, vendorUpdateVendorRequestVendorPrincipal.driverLicenseNumber) &&
        Objects.equals(this.email, vendorUpdateVendorRequestVendorPrincipal.email)&&
        Objects.equals(this.additionalProperties, vendorUpdateVendorRequestVendorPrincipal.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, address, city, zip, country, dob, personalIdentificationNumber, driverLicenseNumber, email, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorUpdateVendorRequestVendorPrincipal {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    personalIdentificationNumber: ").append(toIndentedString(personalIdentificationNumber)).append("\n");
    sb.append("    driverLicenseNumber: ").append(toIndentedString(driverLicenseNumber)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("firstName");
    openapiFields.add("lastName");
    openapiFields.add("address");
    openapiFields.add("city");
    openapiFields.add("zip");
    openapiFields.add("country");
    openapiFields.add("dob");
    openapiFields.add("personalIdentificationNumber");
    openapiFields.add("driverLicenseNumber");
    openapiFields.add("email");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VendorUpdateVendorRequestVendorPrincipal
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VendorUpdateVendorRequestVendorPrincipal.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VendorUpdateVendorRequestVendorPrincipal is not found in the empty JSON string", VendorUpdateVendorRequestVendorPrincipal.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("firstName") != null && !jsonObj.get("firstName").isJsonNull()) && !jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if ((jsonObj.get("lastName") != null && !jsonObj.get("lastName").isJsonNull()) && !jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("zip") != null && !jsonObj.get("zip").isJsonNull()) && !jsonObj.get("zip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zip").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("dob") != null && !jsonObj.get("dob").isJsonNull()) && !jsonObj.get("dob").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dob` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dob").toString()));
      }
      if ((jsonObj.get("driverLicenseNumber") != null && !jsonObj.get("driverLicenseNumber").isJsonNull()) && !jsonObj.get("driverLicenseNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `driverLicenseNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("driverLicenseNumber").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VendorUpdateVendorRequestVendorPrincipal.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VendorUpdateVendorRequestVendorPrincipal' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VendorUpdateVendorRequestVendorPrincipal> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VendorUpdateVendorRequestVendorPrincipal.class));

       return (TypeAdapter<T>) new TypeAdapter<VendorUpdateVendorRequestVendorPrincipal>() {
           @Override
           public void write(JsonWriter out, VendorUpdateVendorRequestVendorPrincipal value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public VendorUpdateVendorRequestVendorPrincipal read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VendorUpdateVendorRequestVendorPrincipal instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VendorUpdateVendorRequestVendorPrincipal given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VendorUpdateVendorRequestVendorPrincipal
  * @throws IOException if the JSON string is invalid with respect to VendorUpdateVendorRequestVendorPrincipal
  */
  public static VendorUpdateVendorRequestVendorPrincipal fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VendorUpdateVendorRequestVendorPrincipal.class);
  }

 /**
  * Convert an instance of VendorUpdateVendorRequestVendorPrincipal to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

