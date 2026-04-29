

# SectorWeightage

Sector allocation percentages based on FactSet RBICS classification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. |  [optional]
**requestId** | **String** | The requested Id sent as input. |  [optional]
**date** | **LocalDate** | The date in YYYY-MM-DD format. |  [optional]
**analyticsType** | **SectorWeightageType** |  | 
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  |  [optional]
**sector** | **String** | Sector data based on FactSet RBICS classification. |  [optional]
**sectorWeightagePercentage** | **Double** | The percentage weight of the sector in the fund&#39;s portfolio, based on FactSet RBICS classification. |  [optional]


## Implemented Interfaces

* Serializable


