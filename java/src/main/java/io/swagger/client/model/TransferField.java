/*
 * Genesys Transfer Data
 * API for storing/retrieving transfer data.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * TransferField
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-10T22:19:41.489Z[GMT]")
public class TransferField implements AnyOfTransferDataField {
  @SerializedName("keyName")
  private String keyName = null;

  /**
   * the transformation to apply to the value. &lt;p&gt;For phoneNumber, when received from/sent to cloud, format is E.164. When received from/sent to engage, format is 10 digit. If engage sends fewer than 10 digits, and keyName is &#x60;DNIS&#x60;, accept the value, and do not transform. &lt;p&gt;For language, cloud uses ANSI, premise uses language. For instance, when receiving from/sending to cloud, use &#x60;en-US&#x60; for English. When sending to/receiving from premise, use &#x60;English&#x60;. If type is &#x27;any&#x27;, the field will be stored/retrieved with no transformation.
   */
  @JsonAdapter(TransformTypeEnum.Adapter.class)
  public enum TransformTypeEnum {
    PHONENUMBER("phoneNumber"),
    LANGUAGE("language"),
    ANY("any");

    private String value;

    TransformTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TransformTypeEnum fromValue(String text) {
      for (TransformTypeEnum b : TransformTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TransformTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransformTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TransformTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TransformTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("transformType")
  private TransformTypeEnum transformType = null;

  @SerializedName("value")
  private String value = null;

  public TransferField keyName(String keyName) {
    this.keyName = keyName;
    return this;
  }

   /**
   * the name of a field to be stored as transfer data.
   * @return keyName
  **/
  @Schema(example = "callAni", description = "the name of a field to be stored as transfer data.")
  public String getKeyName() {
    return keyName;
  }

  public void setKeyName(String keyName) {
    this.keyName = keyName;
  }

  public TransferField transformType(TransformTypeEnum transformType) {
    this.transformType = transformType;
    return this;
  }

   /**
   * the transformation to apply to the value. &lt;p&gt;For phoneNumber, when received from/sent to cloud, format is E.164. When received from/sent to engage, format is 10 digit. If engage sends fewer than 10 digits, and keyName is &#x60;DNIS&#x60;, accept the value, and do not transform. &lt;p&gt;For language, cloud uses ANSI, premise uses language. For instance, when receiving from/sending to cloud, use &#x60;en-US&#x60; for English. When sending to/receiving from premise, use &#x60;English&#x60;. If type is &#x27;any&#x27;, the field will be stored/retrieved with no transformation.
   * @return transformType
  **/
  @Schema(description = "the transformation to apply to the value. <p>For phoneNumber, when received from/sent to cloud, format is E.164. When received from/sent to engage, format is 10 digit. If engage sends fewer than 10 digits, and keyName is `DNIS`, accept the value, and do not transform. <p>For language, cloud uses ANSI, premise uses language. For instance, when receiving from/sending to cloud, use `en-US` for English. When sending to/receiving from premise, use `English`. If type is 'any', the field will be stored/retrieved with no transformation.")
  public TransformTypeEnum getTransformType() {
    return transformType;
  }

  public void setTransformType(TransformTypeEnum transformType) {
    this.transformType = transformType;
  }

  public TransferField value(String value) {
    this.value = value;
    return this;
  }

   /**
   * the field&#x27;s value, corresponding the the keyName. If the fieldValue is set to blank, or &#x60;NOT_SET&#x60;, remove the field prior to storage.
   * @return value
  **/
  @Schema(example = "+9055551212", description = "the field's value, corresponding the the keyName. If the fieldValue is set to blank, or `NOT_SET`, remove the field prior to storage.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferField transferField = (TransferField) o;
    return Objects.equals(this.keyName, transferField.keyName) &&
        Objects.equals(this.transformType, transferField.transformType) &&
        Objects.equals(this.value, transferField.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyName, transformType, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferField {\n");
    
    sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
    sb.append("    transformType: ").append(toIndentedString(transformType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
