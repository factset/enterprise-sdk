# flake8: noqa

# import all models into this package
# if you have many models here with many references from one model to another this may
# raise a RecursionError
# to avoid this, import only the models that you directly need like:
# from from fds.sdk.Vermilion.model.pet import Pet
# or import this package, but before doing it, use:
# import sys
# sys.setrecursionlimit(n)

from fds.sdk.Vermilion.model.create_scim_user_json_request import CreateScimUserJSONRequest
from fds.sdk.Vermilion.model.create_scim_user_json_request_name import CreateScimUserJSONRequestName
from fds.sdk.Vermilion.model.created_scim_user_json_response import CreatedScimUserJSONResponse
from fds.sdk.Vermilion.model.created_scim_user_json_response_meta import CreatedScimUserJSONResponseMeta
from fds.sdk.Vermilion.model.data_source_all_data import DataSourceAllData
from fds.sdk.Vermilion.model.data_source_dto import DataSourceDTO
from fds.sdk.Vermilion.model.data_source_data import DataSourceData
from fds.sdk.Vermilion.model.data_source_data_instance import DataSourceDataInstance
from fds.sdk.Vermilion.model.data_source_instance import DataSourceInstance
from fds.sdk.Vermilion.model.data_source_instance_rows import DataSourceInstanceRows
from fds.sdk.Vermilion.model.data_source_list import DataSourceList
from fds.sdk.Vermilion.model.data_source_list_meta import DataSourceListMeta
from fds.sdk.Vermilion.model.data_source_list_meta_pagination import DataSourceListMetaPagination
from fds.sdk.Vermilion.model.entity_dto import EntityDTO
from fds.sdk.Vermilion.model.entity_field_value_dto import EntityFieldValueDTO
from fds.sdk.Vermilion.model.entity_field_value_dto_meta import EntityFieldValueDTOMeta
from fds.sdk.Vermilion.model.entity_field_value_dto_meta_pagination import EntityFieldValueDTOMetaPagination
from fds.sdk.Vermilion.model.entity_selection import EntitySelection
from fds.sdk.Vermilion.model.error import Error
from fds.sdk.Vermilion.model.error_list import ErrorList
from fds.sdk.Vermilion.model.generate_schedule_response import GenerateScheduleResponse
from fds.sdk.Vermilion.model.record_set_field_values import RecordSetFieldValues
from fds.sdk.Vermilion.model.record_set_fields import RecordSetFields
from fds.sdk.Vermilion.model.report_definition_dto import ReportDefinitionDTO
from fds.sdk.Vermilion.model.report_definition_data import ReportDefinitionData
from fds.sdk.Vermilion.model.report_definition_list import ReportDefinitionList
from fds.sdk.Vermilion.model.report_definition_list_meta import ReportDefinitionListMeta
from fds.sdk.Vermilion.model.report_definition_list_meta_pagination import ReportDefinitionListMetaPagination
from fds.sdk.Vermilion.model.report_generation_request import ReportGenerationRequest
from fds.sdk.Vermilion.model.report_generation_request_body import ReportGenerationRequestBody
from fds.sdk.Vermilion.model.report_instance_dto import ReportInstanceDTO
from fds.sdk.Vermilion.model.report_instance_data import ReportInstanceData
from fds.sdk.Vermilion.model.report_instance_data_response import ReportInstanceDataResponse
from fds.sdk.Vermilion.model.report_instance_id import ReportInstanceId
from fds.sdk.Vermilion.model.report_instance_list import ReportInstanceList
from fds.sdk.Vermilion.model.report_instance_list_meta import ReportInstanceListMeta
from fds.sdk.Vermilion.model.report_instance_list_meta_pagination import ReportInstanceListMetaPagination
from fds.sdk.Vermilion.model.report_instance_log_dto import ReportInstanceLogDTO
from fds.sdk.Vermilion.model.report_instance_log_list import ReportInstanceLogList
from fds.sdk.Vermilion.model.report_revision_dto import ReportRevisionDTO
from fds.sdk.Vermilion.model.schedule_apidto import ScheduleAPIDTO
from fds.sdk.Vermilion.model.schedule_apidto_all_of import ScheduleAPIDTOAllOf
from fds.sdk.Vermilion.model.schedule_data import ScheduleData
from fds.sdk.Vermilion.model.schedule_definition import ScheduleDefinition
from fds.sdk.Vermilion.model.schedule_definition_owner_role import ScheduleDefinitionOwnerRole
from fds.sdk.Vermilion.model.schedule_definitions_list import ScheduleDefinitionsList
from fds.sdk.Vermilion.model.schedule_definitions_list_meta import ScheduleDefinitionsListMeta
from fds.sdk.Vermilion.model.schedule_definitions_list_meta_pagination import ScheduleDefinitionsListMetaPagination
from fds.sdk.Vermilion.model.schedule_generation_log import ScheduleGenerationLog
from fds.sdk.Vermilion.model.schedule_generation_log_list import ScheduleGenerationLogList
from fds.sdk.Vermilion.model.schedule_generation_log_list_meta import ScheduleGenerationLogListMeta
from fds.sdk.Vermilion.model.schedule_generation_log_list_meta_pagination import ScheduleGenerationLogListMetaPagination
from fds.sdk.Vermilion.model.schedule_instance_data import ScheduleInstanceData
from fds.sdk.Vermilion.model.schedule_response_data import ScheduleResponseData
from fds.sdk.Vermilion.model.schedule_status_update_response import ScheduleStatusUpdateResponse
from fds.sdk.Vermilion.model.schedules_list import SchedulesList
from fds.sdk.Vermilion.model.schedules_list_meta import SchedulesListMeta
from fds.sdk.Vermilion.model.schedules_list_meta_pagination import SchedulesListMetaPagination
from fds.sdk.Vermilion.model.scim_email import ScimEmail
from fds.sdk.Vermilion.model.scim_error import ScimError
from fds.sdk.Vermilion.model.scim_group import ScimGroup
from fds.sdk.Vermilion.model.scim_group_list_response import ScimGroupListResponse
from fds.sdk.Vermilion.model.scim_group_member import ScimGroupMember
from fds.sdk.Vermilion.model.scim_group_patch_operation import ScimGroupPatchOperation
from fds.sdk.Vermilion.model.scim_group_patch_operation_value import ScimGroupPatchOperationValue
from fds.sdk.Vermilion.model.scim_group_patch_request_body import ScimGroupPatchRequestBody
from fds.sdk.Vermilion.model.scim_meta import ScimMeta
from fds.sdk.Vermilion.model.scim_phone import ScimPhone
from fds.sdk.Vermilion.model.scim_photo import ScimPhoto
from fds.sdk.Vermilion.model.scim_user import ScimUser
from fds.sdk.Vermilion.model.scim_user_group import ScimUserGroup
from fds.sdk.Vermilion.model.scim_user_list_response import ScimUserListResponse
from fds.sdk.Vermilion.model.scim_user_name import ScimUserName
from fds.sdk.Vermilion.model.scim_user_patch_operation import ScimUserPatchOperation
from fds.sdk.Vermilion.model.scim_user_patch_request_body import ScimUserPatchRequestBody
from fds.sdk.Vermilion.model.task_details import TaskDetails
from fds.sdk.Vermilion.model.task_details_object import TaskDetailsObject
from fds.sdk.Vermilion.model.task_history_list import TaskHistoryList
from fds.sdk.Vermilion.model.task_history_list_meta import TaskHistoryListMeta
from fds.sdk.Vermilion.model.task_history_list_meta_pagination import TaskHistoryListMetaPagination
from fds.sdk.Vermilion.model.task_history_object import TaskHistoryObject
from fds.sdk.Vermilion.model.task_list import TaskList
from fds.sdk.Vermilion.model.task_list_item_details import TaskListItemDetails
from fds.sdk.Vermilion.model.task_list_item_details_all_of import TaskListItemDetailsAllOf
from fds.sdk.Vermilion.model.task_list_meta import TaskListMeta
from fds.sdk.Vermilion.model.task_list_meta_pagination import TaskListMetaPagination
from fds.sdk.Vermilion.model.task_patch_request_body import TaskPatchRequestBody
from fds.sdk.Vermilion.model.task_patch_request_body_data import TaskPatchRequestBodyData
from fds.sdk.Vermilion.model.task_patch_response import TaskPatchResponse
from fds.sdk.Vermilion.model.task_patch_response_object import TaskPatchResponseObject
from fds.sdk.Vermilion.model.tenancy import Tenancy
from fds.sdk.Vermilion.model.version_response_body import VersionResponseBody
from fds.sdk.Vermilion.model.version_response_body_data import VersionResponseBodyData
