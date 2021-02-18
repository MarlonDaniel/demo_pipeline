/* tslint:disable:no-unused-variable */

import { TestBed, async, inject } from '@angular/core/testing';
import { VoitureService } from './voiture.service';

describe('Service: Voiture', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [VoitureService]
    });
  });

  it('should ...', inject([VoitureService], (service: VoitureService) => {
    expect(service).toBeTruthy();
  }));
});
