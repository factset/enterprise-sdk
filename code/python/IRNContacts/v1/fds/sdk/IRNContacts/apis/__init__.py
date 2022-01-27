
# flake8: noqa

# Import all APIs into this package.
# If you have many APIs here with many many models used in each API this may
# raise a `RecursionError`.
# In order to avoid this, import only the API that you directly need like:
#
#   from .api.contact_custom_fields_api import ContactCustomFieldsApi
#
# or import this package, but before doing it, use:
#
#   import sys
#   sys.setrecursionlimit(n)

# Import APIs into API package:
from fds.sdk.IRNContacts.api.contact_custom_fields_api import ContactCustomFieldsApi
from fds.sdk.IRNContacts.api.contact_relationships_api import ContactRelationshipsApi
from fds.sdk.IRNContacts.api.contact_roles_api import ContactRolesApi
from fds.sdk.IRNContacts.api.contact_types_api import ContactTypesApi
from fds.sdk.IRNContacts.api.contacts_api import ContactsApi
from fds.sdk.IRNContacts.api.phone_number_types_api import PhoneNumberTypesApi
from fds.sdk.IRNContacts.api.relationship_categories_api import RelationshipCategoriesApi
from fds.sdk.IRNContacts.api.relationships_api import RelationshipsApi
