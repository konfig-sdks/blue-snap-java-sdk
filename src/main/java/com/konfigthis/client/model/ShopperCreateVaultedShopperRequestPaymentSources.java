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
import com.konfigthis.client.model.ShopperCreateVaultedShopperRequestPaymentSourcesCreditCardInfoInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * ShopperCreateVaultedShopperRequestPaymentSources
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ShopperCreateVaultedShopperRequestPaymentSources {
  public static final String SERIALIZED_NAME_CREDIT_CARD_INFO = "creditCardInfo";
  @SerializedName(SERIALIZED_NAME_CREDIT_CARD_INFO)
  private List<ShopperCreateVaultedShopperRequestPaymentSourcesCreditCardInfoInner> creditCardInfo = null;

  public ShopperCreateVaultedShopperRequestPaymentSources() {
  }

  public ShopperCreateVaultedShopperRequestPaymentSources creditCardInfo(List<ShopperCreateVaultedShopperRequestPaymentSourcesCreditCardInfoInner> creditCardInfo) {
    
    
    
    
    this.creditCardInfo = creditCardInfo;
    return this;
  }

  public ShopperCreateVaultedShopperRequestPaymentSources addCreditCardInfoItem(ShopperCreateVaultedShopperRequestPaymentSourcesCreditCardInfoInner creditCardInfoItem) {
    if (this.creditCardInfo == null) {
      this.creditCardInfo = new ArrayList<>();
    }
    this.creditCardInfo.add(creditCardInfoItem);
    return this;
  }

   /**
   * Get creditCardInfo
   * @return creditCardInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ShopperCreateVaultedShopperRequestPaymentSourcesCreditCardInfoInner> getCreditCardInfo() {
    return creditCardInfo;
  }


  public void setCreditCardInfo(List<ShopperCreateVaultedShopperRequestPaymentSourcesCreditCardInfoInner> creditCardInfo) {
    
    
    
    this.creditCardInfo = creditCardInfo;
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
   * @return the ShopperCreateVaultedShopperRequestPaymentSources instance itself
   */
  public ShopperCreateVaultedShopperRequestPaymentSources putAdditionalProperty(String key, Object value) {
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
    ShopperCreateVaultedShopperRequestPaymentSources shopperCreateVaultedShopperRequestPaymentSources = (ShopperCreateVaultedShopperRequestPaymentSources) o;
    return Objects.equals(this.creditCardInfo, shopperCreateVaultedShopperRequestPaymentSources.creditCardInfo)&&
        Objects.equals(this.additionalProperties, shopperCreateVaultedShopperRequestPaymentSources.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditCardInfo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopperCreateVaultedShopperRequestPaymentSources {\n");
    sb.append("    creditCardInfo: ").append(toIndentedString(creditCardInfo)).append("\n");
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
    openapiFields.add("creditCardInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ShopperCreateVaultedShopperRequestPaymentSources
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ShopperCreateVaultedShopperRequestPaymentSources.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShopperCreateVaultedShopperRequestPaymentSources is not found in the empty JSON string", ShopperCreateVaultedShopperRequestPaymentSources.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("creditCardInfo") != null && !jsonObj.get("creditCardInfo").isJsonNull()) {
        JsonArray jsonArraycreditCardInfo = jsonObj.getAsJsonArray("creditCardInfo");
        if (jsonArraycreditCardInfo != null) {
          // ensure the json data is an array
          if (!jsonObj.get("creditCardInfo").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `creditCardInfo` to be an array in the JSON string but got `%s`", jsonObj.get("creditCardInfo").toString()));
          }

          // validate the optional field `creditCardInfo` (array)
          for (int i = 0; i < jsonArraycreditCardInfo.size(); i++) {
            ShopperCreateVaultedShopperRequestPaymentSourcesCreditCardInfoInner.validateJsonObject(jsonArraycreditCardInfo.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ShopperCreateVaultedShopperRequestPaymentSources.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShopperCreateVaultedShopperRequestPaymentSources' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShopperCreateVaultedShopperRequestPaymentSources> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShopperCreateVaultedShopperRequestPaymentSources.class));

       return (TypeAdapter<T>) new TypeAdapter<ShopperCreateVaultedShopperRequestPaymentSources>() {
           @Override
           public void write(JsonWriter out, ShopperCreateVaultedShopperRequestPaymentSources value) throws IOException {
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
           public ShopperCreateVaultedShopperRequestPaymentSources read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ShopperCreateVaultedShopperRequestPaymentSources instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ShopperCreateVaultedShopperRequestPaymentSources given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ShopperCreateVaultedShopperRequestPaymentSources
  * @throws IOException if the JSON string is invalid with respect to ShopperCreateVaultedShopperRequestPaymentSources
  */
  public static ShopperCreateVaultedShopperRequestPaymentSources fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShopperCreateVaultedShopperRequestPaymentSources.class);
  }

 /**
  * Convert an instance of ShopperCreateVaultedShopperRequestPaymentSources to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

