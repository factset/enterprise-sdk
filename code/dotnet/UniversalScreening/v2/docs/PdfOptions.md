# FactSet.SDK.UniversalScreening.Model.PdfOptions
Options applied to PDF output.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ApplyAlternateRowShading** | **bool?** | Specifies whether every other row shading should be applied to the output. By default, this option is set to false, which means that every other row shading will not be included in the download. | [optional] [default to false]
**ApplyFilters** | **bool?** | Specifies whether the filters present in the screen should be applied to the output. By default, this option is set to false, which means that filters will not be applied and all securities passing the screen will be included in the output. | [optional] [default to false]
**ApplyTextWrapping** | **bool?** | Specifies that the text in cells be wrapped if there are more characters than can fit in the space available. By default, this option is set to true. | [optional] [default to true]
**OrientationLandscape** | **bool?** | Specifies the page orientation of the downloaded file. Value true for Landscape, false for Portrait. By default this is set to false. | [optional] [default to false]
**CustomTitle** | **string** | Sets a custom title for the download. | [optional] 
**CustomSubtitle** | **string** | Sets a custom subtitle for the download. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

