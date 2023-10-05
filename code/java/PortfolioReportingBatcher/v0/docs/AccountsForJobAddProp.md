

# AccountsForJobAddProp

The details of the account under the task in the object key

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**includeParent** | **Boolean** | Indicates whether or not the parent portfolio is included as a separate portfolio when isSplit is true |  [optional]
**isSplit** | **Boolean** | Indicates whether the portfolio&#39;s components if any would be treated as individual portfolios when the job is run |  [optional]
**latestComponentsOnly** | **Boolean** | When selected, the ACTM/CSTM will be split and will only return components that are still held in the ACTM. I.e., when the end date is \&quot;Latest,\&quot; it will not return components where the end date occurs before Latest. |  [optional]
**level** | **String** | The number of levels when isSplit is true that the job will expand down to for a composite portfolio (CSTM or ACTM). \&quot;1\&quot; means only the first level will be expanded. \&quot;all\&quot; will be the value if all levels are expanded down. |  [optional]
**portfolioId** | **String** | The full file path including portfolio name and type |  [optional]


## Implemented Interfaces

* Serializable


