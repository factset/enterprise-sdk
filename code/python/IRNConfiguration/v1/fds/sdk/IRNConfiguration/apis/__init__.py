
# flake8: noqa

# Import all APIs into this package.
# If you have many APIs here with many many models used in each API this may
# raise a `RecursionError`.
# In order to avoid this, import only the API that you directly need like:
#
#   from .api.authors_api import AuthorsApi
#
# or import this package, but before doing it, use:
#
#   import sys
#   sys.setrecursionlimit(n)

# Import APIs into API package:
from fds.sdk.IRNConfiguration.api.authors_api import AuthorsApi
from fds.sdk.IRNConfiguration.api.custom_fields_api import CustomFieldsApi
from fds.sdk.IRNConfiguration.api.group_api import GroupApi
from fds.sdk.IRNConfiguration.api.recommendations_api import RecommendationsApi
from fds.sdk.IRNConfiguration.api.sentiments_api import SentimentsApi
from fds.sdk.IRNConfiguration.api.subjects_api import SubjectsApi
from fds.sdk.IRNConfiguration.api.teams_api import TeamsApi
from fds.sdk.IRNConfiguration.api.users_api import UsersApi
