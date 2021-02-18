import { Component, OnInit } from '@angular/core';

import { Voiture } from 'src/app/model/voiture';
import { VoitureService } from '../../services/api/voiture.service';

// import de les variables de environement (dossier environments)
import { environment } from 'src/environments/environment';

@Component({
  selector: 'app-voiture-list',
  templateUrl: './voiture-list.component.html',
  styleUrls: ['./voiture-list.component.scss']
})
export class VoitureListComponent implements OnInit {

  public lista:Voiture[] = [];
  // access a les environements variables
  env = environment;

  constructor(
    //private router: Router,
    private voitureService: VoitureService,

    
  ) { }

  ngOnInit() {
    this.getList();
    console.log("LOG onOnInit voiture-list.component.ts");
  }
  
  getList(){
    console.log("LOG getList voiture-list.component.ts");
    this.voitureService.list().toPromise()
    .then((data) =>{
      this.lista = data;
      console.log(JSON.stringify(this.lista));
    });
  }
}
