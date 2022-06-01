

# OptionsVolume

Options Volume Response Object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet&#39;s Option Symbol. For more detail, visit [OA 12636](https://my.apps.factset.com/oa/pages/12636#options) |  [optional]
**date** | **LocalDate** | The date of the data in YYYY-MM-DD format |  [optional]
**exchange** | **String** | Option Exchange ISO. Visit [OA 14925](https://my.apps.factset.com/oa/pages/14925) for a list of Exchange ISOs. |  [optional]
**openInterest** | **BigDecimal** | The total number of options and/or futures contracts that are not closed or delivered on a particular day. |  [optional]
**volume** | **Double** | Volume of the option |  [optional]
**requestId** | **String** | The requested identifier submitted in the query. |  [optional]


## Implemented Interfaces

* Serializable


