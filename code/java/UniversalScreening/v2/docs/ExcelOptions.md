

# ExcelOptions

Options applied to Excel output.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isSummary** | **Boolean** | Specifies that a summary will be generated instead of the full results output. Only the \&quot;applyFilters\&quot; option will have any affect if this is true. By default this option is set to false. |  [optional]
**applySavedNAFormatting** | **Boolean** | Specifies that the NA formatting specified in the column format menu will be used to indicate unavailable data in your output. By default, this option is set to false, which means \&quot;NA\&quot; will be used to indicate the data that is not available. |  [optional]
**applyFilters** | **Boolean** | Specifies whether the filters present in the screen should be applied to the output. By default, this option is set to false, which means that filters will not be applied and all securities passing the screen will be included in the output. |  [optional]
**applyAlternateRowShading** | **Boolean** | Specifies whether every other row shading should be applied to the output. By default, this option is set to false, which means that every other row shading will not be included in the download. |  [optional]
**applyExcelOutlining** | **Boolean** | Specifies that the Download Outline feature will be used when putting the screen&#39;s groupings into an Excel spreadsheet. By default, this option is set to false. |  [optional]
**condenseTabsToOneSheet** | **Boolean** | Specifies whether the report will be downloaded into a single spreadsheet, or into separate sheets following the tabs in the report. By default, this option is set to false. |  [optional]


## Implemented Interfaces

* Serializable


