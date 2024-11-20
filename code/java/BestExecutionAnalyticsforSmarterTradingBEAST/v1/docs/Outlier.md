

# Outlier

The Outlier object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**securityId** | **String** | Security Id |  [optional]
**orderId** | **String** | Order Id |  [optional]
**compositeId** | **String** | Composite Id |  [optional]
**messageType** | [**MessageTypeEnum**](#MessageTypeEnum) | Order type |  [optional]
**metric** | **Double** | Metric |  [optional]
**side** | **String** | Side |  [optional]
**volume** | **Double** | Volume |  [optional]
**price** | **Double** | Price |  [optional]
**value** | **Double** | Value |  [optional]
**refValue** | **Double** | Ref Value |  [optional]
**dateId** | **String** | Date |  [optional]
**broker** | **String** | Broker |  [optional]
**trader** | **String** | Trader |  [optional]
**currency** | **String** | Currency |  [optional]
**country** | **String** | The two character ISO country code |  [optional]
**isin** | **String** | Isin |  [optional]
**winsorized** | **Double** | Winsorized |  [optional]
**outlier** | **Boolean** | Outlier flag |  [optional]
**duration** | **Long** | Duration |  [optional]
**timeZone** | **String** | The timezone identifier as defined in the list of tz database timezones  https://en.wikipedia.org/wiki/List_of_tz_database_time_zones |  [optional]
**timeZoneName** | **String** | The timezone abbreviation as defined in the list of tz database timezones  https://en.wikipedia.org/wiki/List_of_tz_database_time_zones |  [optional]
**symbol** | **String** | Symbol |  [optional]
**region** | **String** | The two character ISO country code of the trading region. EMEA is used for the European trading region |  [optional]



## Enum: MessageTypeEnum

Name | Value
---- | -----
UNDEFINED | &quot;undefined&quot;
PARENT | &quot;parent&quot;
CHILD | &quot;child&quot;


## Implemented Interfaces

* Serializable


