# timeseriesapifordigitalportals.PricesTimeSeriesIntradayListData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the notation. | 
**type** | **String** | Type of the price as configured for the customer. | [optional] [default to &#39;trade&#39;]
**quality** | **String** | Quality of the price. | [optional] [default to &#39;DLY&#39;]
**range** | [**PricesTimeSeriesIntradayListDataRange**](PricesTimeSeriesIntradayListDataRange.md) |  | 
**applyTickCorrections** | **String** | This attribute represents the choice whether to apply insert, update, and delete corrections for individual ticks sent by the exchange or devised by FactSet Digital Solutions GmbH.   If the exchange or FactSet Digital Solutions GmbH decides to correct data, a correction instruction tick is sent shortly (usually on the same trading day) after dissemination of the corresponding original tick (if any). The correction instruction is then applied, yielding a corrected view. For \&quot;insert\&quot; corrections, there is no original tick, and the corrected view contains the inserted tick. For \&quot;update\&quot; corrections, the corrected view contains the updated original tick. For \&quot;delete\&quot; corrections, the original tick is removed from the corrected view. | [optional] [default to &#39;none&#39;]



## Enum: TypeEnum


* `trade` (value: `"trade"`)

* `bid` (value: `"bid"`)

* `ask` (value: `"ask"`)

* `yield` (value: `"yield"`)





## Enum: QualityEnum


* `RLT` (value: `"RLT"`)

* `DLY` (value: `"DLY"`)

* `BST` (value: `"BST"`)





## Enum: ApplyTickCorrectionsEnum


* `none` (value: `"none"`)

* `all` (value: `"all"`)




