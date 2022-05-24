# flake8: noqa

# import all models into this package
# if you have many models here with many references from one model to another this may
# raise a RecursionError
# to avoid this, import only the models that you directly need like:
# from from fds.sdk.IRNContacts.model.pet import Pet
# or import this package, but before doing it, use:
# import sys
# sys.setrecursionlimit(n)

from fds.sdk.IRNContacts.model.alternative_email_address_dto import AlternativeEmailAddressDto
from fds.sdk.IRNContacts.model.contact_address_dto import ContactAddressDto
from fds.sdk.IRNContacts.model.contact_custom_field_option_value_dto import ContactCustomFieldOptionValueDto
from fds.sdk.IRNContacts.model.contact_custom_field_value_dto import ContactCustomFieldValueDto
from fds.sdk.IRNContacts.model.contact_custom_field_value_save_dto import ContactCustomFieldValueSaveDto
from fds.sdk.IRNContacts.model.contact_dto import ContactDto
from fds.sdk.IRNContacts.model.contact_event_dto import ContactEventDto
from fds.sdk.IRNContacts.model.contact_event_update_dto import ContactEventUpdateDto
from fds.sdk.IRNContacts.model.contact_id_name_dto import ContactIdNameDto
from fds.sdk.IRNContacts.model.contact_phone_dto import ContactPhoneDto
from fds.sdk.IRNContacts.model.contact_phone_save_dto import ContactPhoneSaveDto
from fds.sdk.IRNContacts.model.contact_relationship_dto import ContactRelationshipDto
from fds.sdk.IRNContacts.model.contact_relationship_save_dto import ContactRelationshipSaveDto
from fds.sdk.IRNContacts.model.contact_relationship_two_sided_dto import ContactRelationshipTwoSidedDto
from fds.sdk.IRNContacts.model.contact_relationship_two_sided_save_dto import ContactRelationshipTwoSidedSaveDto
from fds.sdk.IRNContacts.model.contact_role_dto import ContactRoleDto
from fds.sdk.IRNContacts.model.contact_save_dto import ContactSaveDto
from fds.sdk.IRNContacts.model.contact_summary_dto import ContactSummaryDto
from fds.sdk.IRNContacts.model.contact_type_dto import ContactTypeDto
from fds.sdk.IRNContacts.model.employer_dto import EmployerDto
from fds.sdk.IRNContacts.model.new_item_dto import NewItemDto
from fds.sdk.IRNContacts.model.operation import Operation
from fds.sdk.IRNContacts.model.operation_type import OperationType
from fds.sdk.IRNContacts.model.phone_number_type_dto import PhoneNumberTypeDto
from fds.sdk.IRNContacts.model.problem_details import ProblemDetails
from fds.sdk.IRNContacts.model.record_preview_dto import RecordPreviewDto
from fds.sdk.IRNContacts.model.relationship_category_id_name_dto import RelationshipCategoryIdNameDto
from fds.sdk.IRNContacts.model.relationship_id_name_dto import RelationshipIdNameDto
from fds.sdk.IRNContacts.model.relationship_symbol_summary_dto import RelationshipSymbolSummaryDto
from fds.sdk.IRNContacts.model.symbol_type import SymbolType
