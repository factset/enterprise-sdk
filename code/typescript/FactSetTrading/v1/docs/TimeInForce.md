# factsettrading.TimeInForce

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tif** | **String** | Time in force: if goodTillDate, then Expire Time or Expire Date is a required field | [optional] 
**expireDate** | **String** | Expire date in YYYYMMDD format expressed in UTC | [optional] 
**expireTime** | **String** | Expire time in YYYYMMDD-HH:MM:SS format expressed in UTC | [optional] 



## Enum: TifEnum


* `day` (value: `"day"`)

* `goodTillCancel` (value: `"goodTillCancel"`)

* `atTheOpening` (value: `"atTheOpening"`)

* `immediateOrCancel` (value: `"immediateOrCancel"`)

* `fillOrKill` (value: `"fillOrKill"`)

* `goodTillCrossing` (value: `"goodTillCrossing"`)

* `goodTillDate` (value: `"goodTillDate"`)

* `atc` (value: `"atc"`)




