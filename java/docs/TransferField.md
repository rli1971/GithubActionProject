# TransferField

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**keyName** | **String** | the name of a field to be stored as transfer data. |  [optional]
**transformType** | [**TransformTypeEnum**](#TransformTypeEnum) | the transformation to apply to the value. &lt;p&gt;For phoneNumber, when received from/sent to cloud, format is E.164. When received from/sent to engage, format is 10 digit. If engage sends fewer than 10 digits, and keyName is &#x60;DNIS&#x60;, accept the value, and do not transform. &lt;p&gt;For language, cloud uses ANSI, premise uses language. For instance, when receiving from/sending to cloud, use &#x60;en-US&#x60; for English. When sending to/receiving from premise, use &#x60;English&#x60;. If type is &#x27;any&#x27;, the field will be stored/retrieved with no transformation. |  [optional]
**value** | **String** | the field&#x27;s value, corresponding the the keyName. If the fieldValue is set to blank, or &#x60;NOT_SET&#x60;, remove the field prior to storage. |  [optional]

<a name="TransformTypeEnum"></a>
## Enum: TransformTypeEnum
Name | Value
---- | -----
PHONENUMBER | &quot;phoneNumber&quot;
LANGUAGE | &quot;language&quot;
ANY | &quot;any&quot;
