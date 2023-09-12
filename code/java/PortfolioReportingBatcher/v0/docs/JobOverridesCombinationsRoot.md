

# JobOverridesCombinationsRoot

Used for Vault job type only. This creates a matrix of given accounts and dates. When the job is run, it will only run for the accounts and dates within this object. (Settings will only be used temporarily and no changes will be made to the default PRB job.)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accounts** | **java.util.List&lt;String&gt;** | An array of accounts |  [optional]
**dates** | **java.util.List&lt;LocalDate&gt;** | An array of dates |  [optional]


## Implemented Interfaces

* Serializable


