# DataFiles

Returns Data Response.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**trial_id** | **str** | ID of the trial assigned by the trial registry. | [optional] 
**version** | **int** | Specifies the version of a trial. | [optional] 
**file_name** | **str** | The filename of the trial data. | [optional] 
**clinical_trial_id** | **str** | Specifies Ozmosi unique ID for each historical version of a trial. | [optional] 
**unique_protocol_id** | **str** | ID assigned by the sponsor of a trial. | [optional] 
**official_title** | **str** | Full scientific title of a trial. | [optional] 
**overall_status** | **str** | Defines the current stage of a trial&#39;s activity. | [optional] 
**primary_completion** | **datetime** | The date where the final patient is examined or treated for the purpose of collecting data on the trial&#39;s primary outcome measures. Trial Sponsors may publicly announce the data. results after this date | [optional] 
**study_completion** | **datetime** | The date that treatment will complete in the trial and data will be fully collected for secondary outcome measures and adverse events. | [optional] 
**first_posted** | **datetime** | The date on which the trial was first available on ClinicalTrials.gov. Specifically, this date refers to version 1 of a trial | [optional] 
**last_posted** | **datetime** | The date on which this version of a trial was officially updated and publicly visible on the registry. | [optional] 
**sponsor** | **str** | The primary sponsor of the trial. | [optional] 
**responsible_party** | **str** | Identifies if the responsible party of the trial is the Sponsor (The entity that initiates the study), the Principal Investigator (An individual designated by the Sponsor) or Sponsor-Investigator (An individual both initiating and conduct the trial) | [optional] 
**data_monitoring** | **str** | Identifies if the trial involves a group of independent scientists who monitor the safety and scientific integrity of a clinical trial. | [optional] 
**study_type** | **str** | Describes the nature of a clinical study. | [optional] 
**primary_purpose** | **str** | Describes the main reason for the clinical trial. | [optional] 
**study_phase** | **str** | Specifies the stage of a clinical trial studying a drug or biological product. | [optional] 
**interventional_model** | **str** | Describes the general design of the strategy for assigning interventions to participants in a clinical study. | [optional] 
**number_of_arms** | **int** | The number of clinical arms for study. | [optional] 
**masking** | **str** | Defines the type of masking. | [optional] 
**allocation** | **str** | Identifies the method used to assign participants to an arm of a clinical study. | [optional] 
**enrollment** | **int** | Number of patients enrolled. | [optional] 
**minimum_age** | **str** | Minimum age of participants. | [optional] 
**maximum_age** | **str** | Maximum age of participants. | [optional] 
**sex** | **str** | A type of eligibility criteria that indicates the sex of people who may participate in a clinical study. | [optional] 
**gender_based** | **str** | Defines if study is gender specific. | [optional] 
**accepts_volunteers** | **str** | A type of eligibility criteria that indicates whether people who do not have the condition/disease being studied can participate in that clinical study. | [optional] 
**date** | **datetime** | Specifies the timestamp of each version of a trial. | [optional] 
**record_verification** | **datetime** | The date on which the responsible party last verified the clinical study information in the entire ClinicalTrials.gov record for the clinical study, even if no additional or updated information is being submitted | [optional] 
**study_start** | **datetime** | Date that the trial becomes open for recruitment or the date on which the first patient was enrolled. | [optional] 
**first_submitted** | **datetime** | The date that the trial was submitted to the registry. | [optional] 
**first_submit_met_qx_crite** | **datetime** | The date on which a submitted study record is confirmed to be consistent with National Library of Medicine (NLM) quality control (QC) review criteria. | [optional] 
**last_submit_met_qx_crite** | **datetime** | The most recent date on which the study sponsor or investigator submitted changes to a study record. | [optional] 
**primary_comp_date_type** | **str** | Designates if primary completion date is actual or anticipated. | [optional] 
**study_completion_date_type** | **str** | Designates if study completion date is actual or anticipated. | [optional] 
**first_posted_date_type** | **str** | Designates if the first posted date is actual or anticipated. | [optional] 
**last_posted_date_type** | **str** | Designates if the last update posted date is actual or anticipated. | [optional] 
**enrollment_type** | **str** | Identifies if the enrollment number is the anticipated or actual amount. | [optional] 
**beam_probability_of_trial_success** | **float** | Probability of trial success. | [optional] 
**beam_probability_of_launch** | **float** | Probability of trial being launched. | [optional] 
**url** | **str** | Download link for the clinical trials provided by the Ozmosi feed. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


