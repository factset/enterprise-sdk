

# TimeInForce

Time in Force

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tif** | [**TifEnum**](#TifEnum) | Time in force: if goodTillDate, then Expire Time or Expire Date is a required field |  [optional]
**expireDate** | **String** | Expire date in YYYYMMDD format expressed in UTC |  [optional]
**expireTime** | **String** | Expire time in YYYYMMDD-HH:MM:SS format expressed in UTC |  [optional]



## Enum: TifEnum

Name | Value
---- | -----
DAY | &quot;day&quot;
GOODTILLCANCEL | &quot;goodTillCancel&quot;
ATTHEOPENING | &quot;atTheOpening&quot;
IMMEDIATEORCANCEL | &quot;immediateOrCancel&quot;
FILLORKILL | &quot;fillOrKill&quot;
GOODTILLCROSSING | &quot;goodTillCrossing&quot;
GOODTILLDATE | &quot;goodTillDate&quot;
ATC | &quot;atc&quot;


## Implemented Interfaces

* Serializable


