# flake8: noqa

# import all models into this package
# if you have many models here with many references from one model to another this may
# raise a RecursionError
# to avoid this, import only the models that you directly need like:
# from from fds.sdk.FactSetPeople.model.pet import Pet
# or import this package, but before doing it, use:
# import sys
# sys.setrecursionlimit(n)

from fds.sdk.FactSetPeople.model.company_compensation import CompanyCompensation
from fds.sdk.FactSetPeople.model.company_compensation_request import CompanyCompensationRequest
from fds.sdk.FactSetPeople.model.company_compensation_response import CompanyCompensationResponse
from fds.sdk.FactSetPeople.model.company_ids import CompanyIds
from fds.sdk.FactSetPeople.model.company_people import CompanyPeople
from fds.sdk.FactSetPeople.model.company_people_request import CompanyPeopleRequest
from fds.sdk.FactSetPeople.model.company_people_response import CompanyPeopleResponse
from fds.sdk.FactSetPeople.model.company_positions import CompanyPositions
from fds.sdk.FactSetPeople.model.company_positions_request import CompanyPositionsRequest
from fds.sdk.FactSetPeople.model.company_positions_response import CompanyPositionsResponse
from fds.sdk.FactSetPeople.model.company_stats import CompanyStats
from fds.sdk.FactSetPeople.model.company_stats_request import CompanyStatsRequest
from fds.sdk.FactSetPeople.model.company_stats_response import CompanyStatsResponse
from fds.sdk.FactSetPeople.model.error_response import ErrorResponse
from fds.sdk.FactSetPeople.model.error_response_sub_errors import ErrorResponseSubErrors
from fds.sdk.FactSetPeople.model.function import Function
from fds.sdk.FactSetPeople.model.ids import Ids
from fds.sdk.FactSetPeople.model.job import Job
from fds.sdk.FactSetPeople.model.level import Level
from fds.sdk.FactSetPeople.model.mb_type import MbType
from fds.sdk.FactSetPeople.model.people_jobs_request import PeopleJobsRequest
from fds.sdk.FactSetPeople.model.people_jobs_response import PeopleJobsResponse
from fds.sdk.FactSetPeople.model.people_profiles_request import PeopleProfilesRequest
from fds.sdk.FactSetPeople.model.people_profiles_response import PeopleProfilesResponse
from fds.sdk.FactSetPeople.model.position import Position
from fds.sdk.FactSetPeople.model.profile import Profile
from fds.sdk.FactSetPeople.model.status import Status
from fds.sdk.FactSetPeople.model.type import Type
