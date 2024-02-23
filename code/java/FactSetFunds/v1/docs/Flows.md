

# Flows


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested. |  [optional]
**fundFlows** | **Double** | Fund flows data for the specified share class in raw units of the specified currency. |  [optional]
**currency** | **String** | The Currency of the AUM values. By default it will be in the FUnds Currency, unless otherwise requested via the currency parameter. |  [optional]
**date** | **LocalDate** | The date of the AUM in YYYY-MM-DD format. |  [optional]
**requestId** | **String** | The requested Id sent as input. |  [optional]


## Implemented Interfaces

* Serializable


