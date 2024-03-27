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
 * AuthorizationCreateTransactionRequestCreditCard
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AuthorizationCreateTransactionRequestCreditCard {
  public static final String SERIALIZED_NAME_EXPIRATION_YEAR = "expirationYear";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_YEAR)
  private Integer expirationYear = 2026;

  public static final String SERIALIZED_NAME_SECURITY_CODE = "securityCode";
  @SerializedName(SERIALIZED_NAME_SECURITY_CODE)
  private Integer securityCode = 837;

  public static final String SERIALIZED_NAME_EXPIRATION_MONTH = "expirationMonth";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_MONTH)
  private String expirationMonth = "02";

  public static final String SERIALIZED_NAME_CARD_NUMBER = "cardNumber";
  @SerializedName(SERIALIZED_NAME_CARD_NUMBER)
  private String cardNumber = "4263982640269299";

  public AuthorizationCreateTransactionRequestCreditCard() {
  }

  public AuthorizationCreateTransactionRequestCreditCard expirationYear(Integer expirationYear) {
    
    
    
    
    this.expirationYear = expirationYear;
    return this;
  }

   /**
   * Get expirationYear
   * @return expirationYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2026", value = "")

  public Integer getExpirationYear() {
    return expirationYear;
  }


  public void setExpirationYear(Integer expirationYear) {
    
    
    
    this.expirationYear = expirationYear;
  }


  public AuthorizationCreateTransactionRequestCreditCard securityCode(Integer securityCode) {
    
    
    
    
    this.securityCode = securityCode;
    return this;
  }

   /**
   * Get securityCode
   * @return securityCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "837", value = "")

  public Integer getSecurityCode() {
    return securityCode;
  }


  public void setSecurityCode(Integer securityCode) {
    
    
    
    this.securityCode = securityCode;
  }


  public AuthorizationCreateTransactionRequestCreditCard expirationMonth(String expirationMonth) {
    
    
    
    
    this.expirationMonth = expirationMonth;
    return this;
  }

   /**
   * Get expirationMonth
   * @return expirationMonth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "02", value = "")

  public String getExpirationMonth() {
    return expirationMonth;
  }


  public void setExpirationMonth(String expirationMonth) {
    
    
    
    this.expirationMonth = expirationMonth;
  }


  public AuthorizationCreateTransactionRequestCreditCard cardNumber(String cardNumber) {
    
    
    
    
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * Get cardNumber
   * @return cardNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4263982640269299", value = "")

  public String getCardNumber() {
    return cardNumber;
  }


  public void setCardNumber(String cardNumber) {
    
    
    
    this.cardNumber = cardNumber;
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
   * @return the AuthorizationCreateTransactionRequestCreditCard instance itself
   */
  public AuthorizationCreateTransactionRequestCreditCard putAdditionalProperty(String key, Object value) {
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
    AuthorizationCreateTransactionRequestCreditCard authorizationCreateTransactionRequestCreditCard = (AuthorizationCreateTransactionRequestCreditCard) o;
    return Objects.equals(this.expirationYear, authorizationCreateTransactionRequestCreditCard.expirationYear) &&
        Objects.equals(this.securityCode, authorizationCreateTransactionRequestCreditCard.securityCode) &&
        Objects.equals(this.expirationMonth, authorizationCreateTransactionRequestCreditCard.expirationMonth) &&
        Objects.equals(this.cardNumber, authorizationCreateTransactionRequestCreditCard.cardNumber)&&
        Objects.equals(this.additionalProperties, authorizationCreateTransactionRequestCreditCard.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expirationYear, securityCode, expirationMonth, cardNumber, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizationCreateTransactionRequestCreditCard {\n");
    sb.append("    expirationYear: ").append(toIndentedString(expirationYear)).append("\n");
    sb.append("    securityCode: ").append(toIndentedString(securityCode)).append("\n");
    sb.append("    expirationMonth: ").append(toIndentedString(expirationMonth)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
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
    openapiFields.add("expirationYear");
    openapiFields.add("securityCode");
    openapiFields.add("expirationMonth");
    openapiFields.add("cardNumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuthorizationCreateTransactionRequestCreditCard
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AuthorizationCreateTransactionRequestCreditCard.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthorizationCreateTransactionRequestCreditCard is not found in the empty JSON string", AuthorizationCreateTransactionRequestCreditCard.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("expirationMonth") != null && !jsonObj.get("expirationMonth").isJsonNull()) && !jsonObj.get("expirationMonth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expirationMonth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expirationMonth").toString()));
      }
      if ((jsonObj.get("cardNumber") != null && !jsonObj.get("cardNumber").isJsonNull()) && !jsonObj.get("cardNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthorizationCreateTransactionRequestCreditCard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthorizationCreateTransactionRequestCreditCard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthorizationCreateTransactionRequestCreditCard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthorizationCreateTransactionRequestCreditCard.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthorizationCreateTransactionRequestCreditCard>() {
           @Override
           public void write(JsonWriter out, AuthorizationCreateTransactionRequestCreditCard value) throws IOException {
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
           public AuthorizationCreateTransactionRequestCreditCard read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AuthorizationCreateTransactionRequestCreditCard instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AuthorizationCreateTransactionRequestCreditCard given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuthorizationCreateTransactionRequestCreditCard
  * @throws IOException if the JSON string is invalid with respect to AuthorizationCreateTransactionRequestCreditCard
  */
  public static AuthorizationCreateTransactionRequestCreditCard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthorizationCreateTransactionRequestCreditCard.class);
  }

 /**
  * Convert an instance of AuthorizationCreateTransactionRequestCreditCard to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
