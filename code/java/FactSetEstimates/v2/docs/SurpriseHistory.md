

# SurpriseHistory


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endDate** | **LocalDate** | Fiscal period end date for which the consensus estimate is being forecasted. |  [optional]
**currency** | **String** | Currency used for calculations, majority currency in which the analysts are contributing their estimates. For a list of supported ISO currency codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). |  [optional]
**high** | **Double** | The highest estimate provided by the analysts for the specified period. |  [optional]
**low** | **Double** | The lowest estimate provided by the analysts for the specified period. |  [optional]
**up** | **Integer** | Number of estimates revised upwards. |  [optional]
**down** | **Integer** | Number of estimates revised downwards. |  [optional]
**analystCount** | **Integer** | The number of analysts who provided estimates for the given period. |  [optional]
**mean** | **Double** | The average of all estimates provided by the analysts for the specified period. |  [optional]
**median** | **Double** | The median of all estimates provided by the analysts for the specified period. |  [optional]
**standardDeviation** | **Double** | Measure of the dispersion of estimates around the consensus value. |  [optional]
**actual** | **Double** |  |  [optional]
**surprisePercent** | **Double** | Percent difference between last consensus and actual. For more details, visit [Online Assistant Page #16145](https://oa.apps.factset.com/pages/16145). |  [optional]


## Implemented Interfaces

* Serializable


