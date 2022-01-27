# FactSet.SDK.TimeSeriesAPIforDigitalPortals.Model.PricesTimeSeriesIntradayListData
The data member contains the request's primary data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Identifier of the notation. | 
**Type** | **string** | Type of the price as configured for the customer. | [optional] [default to TypeEnum.Trade]
**Quality** | **string** | Quality of the price. | [optional] [default to QualityEnum.DLY]
**Range** | [**PricesTimeSeriesIntradayListDataRange**](PricesTimeSeriesIntradayListDataRange.md) |  | 
**ApplyTickCorrections** | **string** | This attribute represents the choice whether to apply insert, update, and delete corrections for individual ticks sent by the exchange or devised by FactSet Digital Solutions GmbH.   If the exchange or FactSet Digital Solutions GmbH decides to correct data, a correction instruction tick is sent shortly (usually on the same trading day) after dissemination of the corresponding original tick (if any). The correction instruction is then applied, yielding a corrected view. For \&quot;insert\&quot; corrections, there is no original tick, and the corrected view contains the inserted tick. For \&quot;update\&quot; corrections, the corrected view contains the updated original tick. For \&quot;delete\&quot; corrections, the original tick is removed from the corrected view. | [optional] [default to ApplyTickCorrectionsEnum.None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

