

# Field


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | **String** | Field identifier to be used as &#x60;fields&#x60; input in _Terms-and-Conditions_ endpoints.  |  [optional]
**name** | **String** | Plain text name of the field. |  [optional]
**category** | [**CategoryEnum**](#CategoryEnum) | Primary Category of field item, such as COUPON_DETAILS or SECURITY_DETAILS. |  [optional]
**dataType** | **String** | The Data Type of the respective field, including - * date * string * integer * double  |  [optional]



## Enum: CategoryEnum

Name | Value
---- | -----
CONVERTIBLE_FEATURES | &quot;CONVERTIBLE_FEATURES&quot;
COUPON_DETAILS | &quot;COUPON_DETAILS&quot;
REDEMPTION_OPTIONS | &quot;REDEMPTION_OPTIONS&quot;
SECURITY_DETAILS | &quot;SECURITY_DETAILS&quot;


## Implemented Interfaces

* Serializable


