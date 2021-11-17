/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * TypeHolderDefault
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TypeHolderDefault {
  public static final String SERIALIZED_NAME_STRING_ITEM = "string_item";
  @SerializedName(SERIALIZED_NAME_STRING_ITEM)
  private String stringItem = "what";

  public static final String SERIALIZED_NAME_NUMBER_ITEM = "number_item";
  @SerializedName(SERIALIZED_NAME_NUMBER_ITEM)
  private BigDecimal numberItem;

  public static final String SERIALIZED_NAME_INTEGER_ITEM = "integer_item";
  @SerializedName(SERIALIZED_NAME_INTEGER_ITEM)
  private Integer integerItem;

  public static final String SERIALIZED_NAME_BOOL_ITEM = "bool_item";
  @SerializedName(SERIALIZED_NAME_BOOL_ITEM)
  private Boolean boolItem = true;

  public static final String SERIALIZED_NAME_ARRAY_ITEM = "array_item";
  @SerializedName(SERIALIZED_NAME_ARRAY_ITEM)
  private List<Integer> arrayItem = new ArrayList<Integer>();

  public TypeHolderDefault() { 
  }

  public TypeHolderDefault stringItem(String stringItem) {
    
    this.stringItem = stringItem;
    return this;
  }

   /**
   * Get stringItem
   * @return stringItem
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getStringItem() {
    return stringItem;
  }


  public void setStringItem(String stringItem) {
    this.stringItem = stringItem;
  }


  public TypeHolderDefault numberItem(BigDecimal numberItem) {
    
    this.numberItem = numberItem;
    return this;
  }

   /**
   * Get numberItem
   * @return numberItem
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getNumberItem() {
    return numberItem;
  }


  public void setNumberItem(BigDecimal numberItem) {
    this.numberItem = numberItem;
  }


  public TypeHolderDefault integerItem(Integer integerItem) {
    
    this.integerItem = integerItem;
    return this;
  }

   /**
   * Get integerItem
   * @return integerItem
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getIntegerItem() {
    return integerItem;
  }


  public void setIntegerItem(Integer integerItem) {
    this.integerItem = integerItem;
  }


  public TypeHolderDefault boolItem(Boolean boolItem) {
    
    this.boolItem = boolItem;
    return this;
  }

   /**
   * Get boolItem
   * @return boolItem
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getBoolItem() {
    return boolItem;
  }


  public void setBoolItem(Boolean boolItem) {
    this.boolItem = boolItem;
  }


  public TypeHolderDefault arrayItem(List<Integer> arrayItem) {
    
    this.arrayItem = arrayItem;
    return this;
  }

  public TypeHolderDefault addArrayItemItem(Integer arrayItemItem) {
    this.arrayItem.add(arrayItemItem);
    return this;
  }

   /**
   * Get arrayItem
   * @return arrayItem
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Integer> getArrayItem() {
    return arrayItem;
  }


  public void setArrayItem(List<Integer> arrayItem) {
    this.arrayItem = arrayItem;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeHolderDefault typeHolderDefault = (TypeHolderDefault) o;
    return Objects.equals(this.stringItem, typeHolderDefault.stringItem) &&
        Objects.equals(this.numberItem, typeHolderDefault.numberItem) &&
        Objects.equals(this.integerItem, typeHolderDefault.integerItem) &&
        Objects.equals(this.boolItem, typeHolderDefault.boolItem) &&
        Objects.equals(this.arrayItem, typeHolderDefault.arrayItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stringItem, numberItem, integerItem, boolItem, arrayItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeHolderDefault {\n");
    sb.append("    stringItem: ").append(toIndentedString(stringItem)).append("\n");
    sb.append("    numberItem: ").append(toIndentedString(numberItem)).append("\n");
    sb.append("    integerItem: ").append(toIndentedString(integerItem)).append("\n");
    sb.append("    boolItem: ").append(toIndentedString(boolItem)).append("\n");
    sb.append("    arrayItem: ").append(toIndentedString(arrayItem)).append("\n");
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
    openapiFields.add("string_item");
    openapiFields.add("number_item");
    openapiFields.add("integer_item");
    openapiFields.add("bool_item");
    openapiFields.add("array_item");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("string_item");
    openapiRequiredFields.add("number_item");
    openapiRequiredFields.add("integer_item");
    openapiRequiredFields.add("bool_item");
    openapiRequiredFields.add("array_item");
  }

  public static class TypeHolderDefaultDeserializer implements JsonDeserializer<TypeHolderDefault> {
    @Override
    public TypeHolderDefault deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
      JsonObject obj = json.getAsJsonObject(); //since you know it's a JsonObject
      Set<Entry<String, JsonElement>> entries = obj.entrySet();//will return members of your object
      // check to see if the JSON payload contains additional fields
      for (Entry<String, JsonElement> entry: entries) {
        if (!TypeHolderDefault.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException("The field `" + entry.getKey() + "` in the JSON payload is not defined in the `TypeHolderDefault` properties");
        }
      }

      // check to make sure all required properties/fields are present in the JSON payload
      for (String requiredField : TypeHolderDefault.openapiRequiredFields) {
        if (obj.get(requiredField) == null) {
          throw new IllegalArgumentException("The required field `" + requiredField + "` is not found in the JSON payload");
        }
      }

      // all checks passed, return using the original implementation of deserialize
      return deserialize(json, typeOfT, context);
    }
  }
}
