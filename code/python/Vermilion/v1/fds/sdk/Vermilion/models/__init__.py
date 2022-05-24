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
from fds.sdk.Vermilion.model.inline_object import InlineObject
from fds.sdk.Vermilion.model.inline_object1 import InlineObject1
from fds.sdk.Vermilion.model.inline_object2 import InlineObject2
from fds.sdk.Vermilion.model.inline_response400 import InlineResponse400
from fds.sdk.Vermilion.model.inline_response4001 import InlineResponse4001
from fds.sdk.Vermilion.model.inline_response4002 import InlineResponse4002
from fds.sdk.Vermilion.model.inline_response4003 import InlineResponse4003
from fds.sdk.Vermilion.model.inline_response4004 import InlineResponse4004
from fds.sdk.Vermilion.model.inline_response401 import InlineResponse401
from fds.sdk.Vermilion.model.inline_response4011 import InlineResponse4011
from fds.sdk.Vermilion.model.inline_response403 import InlineResponse403
from fds.sdk.Vermilion.model.inline_response4031 import InlineResponse4031
from fds.sdk.Vermilion.model.inline_response4032 import InlineResponse4032
from fds.sdk.Vermilion.model.inline_response4033 import InlineResponse4033
from fds.sdk.Vermilion.model.inline_response4034 import InlineResponse4034
from fds.sdk.Vermilion.model.inline_response4035 import InlineResponse4035
from fds.sdk.Vermilion.model.inline_response4036 import InlineResponse4036
from fds.sdk.Vermilion.model.inline_response4037 import InlineResponse4037
from fds.sdk.Vermilion.model.inline_response4038 import InlineResponse4038
from fds.sdk.Vermilion.model.inline_response404 import InlineResponse404
from fds.sdk.Vermilion.model.inline_response4041 import InlineResponse4041
from fds.sdk.Vermilion.model.inline_response4042 import InlineResponse4042
from fds.sdk.Vermilion.model.inline_response4043 import InlineResponse4043
from fds.sdk.Vermilion.model.inline_response4044 import InlineResponse4044
from fds.sdk.Vermilion.model.inline_response406 import InlineResponse406
from fds.sdk.Vermilion.model.inline_response409 import InlineResponse409
from fds.sdk.Vermilion.model.inline_response4091 import InlineResponse4091
from fds.sdk.Vermilion.model.record_set_field_values import RecordSetFieldValues
from fds.sdk.Vermilion.model.record_set_fields import RecordSetFields
from fds.sdk.Vermilion.model.report_definition_dto import ReportDefinitionDTO
from fds.sdk.Vermilion.model.report_definition_data import ReportDefinitionData
from fds.sdk.Vermilion.model.report_definition_list import ReportDefinitionList
from fds.sdk.Vermilion.model.report_instance_dto import ReportInstanceDTO
from fds.sdk.Vermilion.model.report_instance_data import ReportInstanceData
from fds.sdk.Vermilion.model.report_instance_data_response import ReportInstanceDataResponse
from fds.sdk.Vermilion.model.report_instance_id import ReportInstanceId
from fds.sdk.Vermilion.model.report_instance_list import ReportInstanceList
from fds.sdk.Vermilion.model.report_instance_list_meta import ReportInstanceListMeta
from fds.sdk.Vermilion.model.report_instance_log_dto import ReportInstanceLogDTO
from fds.sdk.Vermilion.model.report_instance_log_list import ReportInstanceLogList
from fds.sdk.Vermilion.model.report_revision_dto import ReportRevisionDTO
from fds.sdk.Vermilion.model.scim_email import ScimEmail
from fds.sdk.Vermilion.model.scim_group import ScimGroup
from fds.sdk.Vermilion.model.scim_group_list_response import ScimGroupListResponse
from fds.sdk.Vermilion.model.scim_group_member import ScimGroupMember
from fds.sdk.Vermilion.model.scim_phone import ScimPhone
from fds.sdk.Vermilion.model.scim_photo import ScimPhoto
from fds.sdk.Vermilion.model.scim_user import ScimUser
from fds.sdk.Vermilion.model.scim_user_list_response import ScimUserListResponse
from fds.sdk.Vermilion.model.scim_user_name import ScimUserName
from fds.sdk.Vermilion.model.v1_report_instances_generate_vrs import V1ReportInstancesGenerateVrs
from fds.sdk.Vermilion.model.v1_report_instances_generate_vrs_instance_id import V1ReportInstancesGenerateVrsInstanceId
from fds.sdk.Vermilion.model.v1_report_instances_generate_vrs_instance_id_entity import V1ReportInstancesGenerateVrsInstanceIdEntity
