# realtimepricealerting.InlineResponse200DataTriggerPrice

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Type of the price as configured for the customer. | Value | Description | | --- | --- | | trade | Trade price (ordinary, auction, pre or post-trading). | | bid | Bid price. | | ask | Ask price. |   | [optional] 
**quality** | **String** | Price quality of the trigger. | Value | Description | | --- | --- | | RLT | Real-Time: intraday prices with minimal technical processing delays. | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. | | EOD | End-of-day: prices updated once per day after the close of trading, possibly with an exchange-imposed delay of several hours. |   | [optional] 



## Enum: TypeEnum


* `trade` (value: `"trade"`)

* `bid` (value: `"bid"`)

* `ask` (value: `"ask"`)





## Enum: QualityEnum


* `RLT` (value: `"RLT"`)

* `DLY` (value: `"DLY"`)

* `EOD` (value: `"EOD"`)




