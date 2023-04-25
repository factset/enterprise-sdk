# FactSet.SDK.OpenFactSetPartnersDocuments.Model.DataFiles
Returns Data Response.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TrialId** | **string** | ID of the trial assigned by the trial registry. | [optional] 
**_Version** | **int** | Specifies the version of a trial. | [optional] 
**FileName** | **string** | The filename of the trial data. | [optional] 
**ClinicalTrialId** | **string** | Specifies Ozmosi unique ID for each historical version of a trial. | [optional] 
**UniqueProtocolId** | **string** | ID assigned by the sponsor of a trial. | [optional] 
**OfficialTitle** | **string** | Full scientific title of a trial. | [optional] 
**OverallStatus** | **string** | Defines the current stage of a trial&#39;s activity. | [optional] 
**PrimaryCompletion** | **DateTime** | The date where the final patient is examined or treated for the purpose of collecting data on the trial&#39;s primary outcome measures. Trial Sponsors may publicly announce the data. results after this date | [optional] 
**StudyCompletion** | **DateTime** | The date that treatment will complete in the trial and data will be fully collected for secondary outcome measures and adverse events. | [optional] 
**FirstPosted** | **DateTime** | The date on which the trial was first available on ClinicalTrials.gov. Specifically, this date refers to version 1 of a trial | [optional] 
**LastPosted** | **DateTime** | The date on which this version of a trial was officially updated and publicly visible on the registry. | [optional] 
**Sponsor** | **string** | The primary sponsor of the trial. | [optional] 
**ResponsibleParty** | **string** | Identifies if the responsible party of the trial is the Sponsor (The entity that initiates the study), the Principal Investigator (An individual designated by the Sponsor) or Sponsor-Investigator (An individual both initiating and conduct the trial) | [optional] 
**DataMonitoring** | **string** | Identifies if the trial involves a group of independent scientists who monitor the safety and scientific integrity of a clinical trial. | [optional] 
**StudyType** | **string** | Describes the nature of a clinical study. | [optional] 
**PrimaryPurpose** | **string** | Describes the main reason for the clinical trial. | [optional] 
**StudyPhase** | **string** | Specifies the stage of a clinical trial studying a drug or biological product. | [optional] 
**InterventionalModel** | **string** | Describes the general design of the strategy for assigning interventions to participants in a clinical study. | [optional] 
**NumberOfArms** | **int** | The number of clinical arms for study. | [optional] 
**Masking** | **string** | Defines the type of masking. | [optional] 
**Allocation** | **string** | Identifies the method used to assign participants to an arm of a clinical study. | [optional] 
**Enrollment** | **int** | Number of patients enrolled. | [optional] 
**MinimumAge** | **string** | Minimum age of participants. | [optional] 
**MaximumAge** | **string** | Maximum age of participants. | [optional] 
**Sex** | **string** | A type of eligibility criteria that indicates the sex of people who may participate in a clinical study. | [optional] 
**GenderBased** | **string** | Defines if study is gender specific. | [optional] 
**AcceptsVolunteers** | **string** | A type of eligibility criteria that indicates whether people who do not have the condition/disease being studied can participate in that clinical study. | [optional] 
**Date** | **DateTime** | Specifies the timestamp of each version of a trial. | [optional] 
**RecordVerification** | **DateTime** | The date on which the responsible party last verified the clinical study information in the entire ClinicalTrials.gov record for the clinical study, even if no additional or updated information is being submitted | [optional] 
**StudyStart** | **DateTime** | Date that the trial becomes open for recruitment or the date on which the first patient was enrolled. | [optional] 
**FirstSubmitted** | **DateTime** | The date that the trial was submitted to the registry. | [optional] 
**FirstSubmitMetQxCrite** | **DateTime** | The date on which a submitted study record is confirmed to be consistent with National Library of Medicine (NLM) quality control (QC) review criteria. | [optional] 
**LastSubmitMetQxCrite** | **DateTime** | The most recent date on which the study sponsor or investigator submitted changes to a study record. | [optional] 
**PrimaryCompDateType** | **string** | Designates if primary completion date is actual or anticipated. | [optional] 
**StudyCompletionDateType** | **string** | Designates if study completion date is actual or anticipated. | [optional] 
**FirstPostedDateType** | **string** | Designates if the first posted date is actual or anticipated. | [optional] 
**LastPostedDateType** | **string** | Designates if the last update posted date is actual or anticipated. | [optional] 
**EnrollmentType** | **string** | Identifies if the enrollment number is the anticipated or actual amount. | [optional] 
**BeamProbabilityOfTrialSuccess** | **decimal** | Probability of trial success. | [optional] 
**BeamProbabilityOfLaunch** | **decimal** | Probability of trial being launched. | [optional] 
**Url** | **string** | Download link for the clinical trials provided by the Ozmosi feed. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

