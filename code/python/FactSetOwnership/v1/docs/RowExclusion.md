# RowExclusion

Controls the exlcusion of specific transaction rows from the data returned. By default, the service will exclude Derivative and Blank Transaction Types.   * **DB** =  Derivative and Blank Transaction Types - excludes both derivative and blank transaction types.   * **B** = Blank Transaction Types - excludes only blank transaction types.   * **N** =   None - includes all transaction types without exclusion.       

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **str** | Controls the exlcusion of specific transaction rows from the data returned. By default, the service will exclude Derivative and Blank Transaction Types.   * **DB** &#x3D;  Derivative and Blank Transaction Types - excludes both derivative and blank transaction types.   * **B** &#x3D; Blank Transaction Types - excludes only blank transaction types.   * **N** &#x3D;   None - includes all transaction types without exclusion.        | defaults to "DB",  must be one of ["DB", "B", "N", ]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


